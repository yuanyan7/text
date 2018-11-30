package cn.smbms.service.flightTickets;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.airports.AirportsMapper;
import cn.smbms.dao.flightTickets.FlightTicketsMapper;
import cn.smbms.dao.flights.FlightsMapper;
import cn.smbms.pojo.FlightTickets;

@Service("flightTicketsService")
public class FlightTicketsServiceImpl implements FlightTicketsService{
	@Resource
	private FlightTicketsMapper flightTicketsMapper;
	@Resource
	private AirportsMapper airportsMapper;
	@Resource
	private FlightsMapper flightsMapper;

	@Override
	public List<FlightTickets> getticketsById(String flightId) {
		List<FlightTickets> flistTiList=null;
		flistTiList=flightTicketsMapper.getticketsById(flightId);
		return flistTiList;
	}

}
