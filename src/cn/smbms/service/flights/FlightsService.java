package cn.smbms.service.flights;

import java.util.List;

import org.jboss.logging.Param;

import cn.smbms.pojo.Flights;

public interface FlightsService {
	/**
	 *  根据所有的航班信息
	 * 
	 * */
	public List<Flights> getFliList();
	/**
	 * 根据条件查询航班信息,展示航班信息时需满足显示起降机场名称的要求 
	 * 
	 * */
	public List<Flights> getFlightsList( @Param("flightDate")String flightDate,
			@Param("takeoffAirportId") String takeoffAirportId,
			@Param("landingAirportId") String landingAirportId);

}
