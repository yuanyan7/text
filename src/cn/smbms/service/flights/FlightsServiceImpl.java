package cn.smbms.service.flights;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.airports.AirportsMapper;
import cn.smbms.dao.flightTickets.FlightTicketsMapper;
import cn.smbms.dao.flights.FlightsMapper;
import cn.smbms.pojo.Flights;
@Service("flightsService")
public class FlightsServiceImpl implements FlightsService{
	@Resource
	private FlightTicketsMapper flightTicketsMapper;
	@Resource
	private AirportsMapper airportsMapper;
	@Resource
	private FlightsMapper flightsMapper;

	@Override
	public List<Flights> getFliList() {
		List<Flights> flightsList=null;
		flightsList=flightsMapper.getFliList();
		return flightsList;
	}

	@Override
	public List<Flights> getFlightsList(String flightDate, String takeoffAirportId, String landingAirportId) {
		List<Flights> flightsList= flightsMapper.getFlightsList(flightDate, takeoffAirportId, landingAirportId);
		return flightsList;
	}

}
