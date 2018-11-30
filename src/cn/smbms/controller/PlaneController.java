package cn.smbms.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.smbms.dao.airports.AirportsMapper;
import cn.smbms.dao.flightTickets.FlightTicketsMapper;
import cn.smbms.dao.flights.FlightsMapper;
import cn.smbms.pojo.Airports;
import cn.smbms.pojo.Flights;
import cn.smbms.pojo.Flighttickets;

import cn.smbms.service.PlaneService;

@Controller
public class PlaneController extends BaseController {
	private Logger logger = Logger.getLogger(PlaneController.class);
	@Resource
	private FlightTicketsMapper flightTicketsMapper;
	@Resource
	private AirportsMapper airportsMapper;
	@Resource
	private FlightsMapper flightsMapper;
	
	@RequestMapping(value="/index.html")
	public String getPlaneList( Model model ){
		List<Flights> fList=null;
		fList=pService.getPaList();
		model.addAttribute("fList", fList);
		return "index";
	}
	@RequestMapping(value="/in.html")
	public String getPlaneList( Model model,HttpServletRequest request) throws ParseException {
		List<Flights> fList=null; 
		String flightDate=request.getParameter("flightDate");
		String takeoffAirportId = request.getParameter("takeoffAirportId");
		String landingAirportId = request.getParameter("landingAirportId");
		System.out.println(takeoffAirportId+"================"+landingAirportId);
		if(flightDate==null & takeoffAirportId==null & landingAirportId==null){
			fList=pService.getPaList();
		}else{
			fList=pService.getFlightsList(flightDate, takeoffAirportId, landingAirportId);
		}
//		for (Flights flights : fList) {
//			logger.debug(flights.getAirline());
//		}
		model.addAttribute("fList", fList);
		return "index";
	}
	@RequestMapping(value="view",method=RequestMethod.POST)
	@ResponseBody
	public String view(@Param("flightId") String flightId){
		/*List<Flighttickets> fList=pService.getticketsById(id);
		model.addAttribute("ffList", fList);
		return "cha";*/
	logger.info("*******************flightid="+flightId);
		List<Flighttickets> fList = pService.getticketsById(flightId);
		String json=JSON.toJSONString(fList);
			return json;
	}
}
