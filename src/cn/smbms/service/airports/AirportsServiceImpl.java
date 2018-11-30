package cn.smbms.service.airports;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.airports.AirportsMapper;
import cn.smbms.dao.flightTickets.FlightTicketsMapper;
import cn.smbms.dao.flights.FlightsMapper;
import cn.smbms.pojo.Airports;

@Service("airportsService")
public class AirportsServiceImpl implements AirportsService{
	@Resource
	private FlightTicketsMapper flightTicketsMapper;
	@Resource
	private AirportsMapper airportsMapper;
	@Resource
	private FlightsMapper flightsMapper;

	@Override
	public List<Airports> getairportById(int id) {
		List<Airports> airportsList=null;
		airportsList=airportsMapper.getairportById(id);
		return airportsList;
	}

}
