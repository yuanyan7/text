package cn.smbms.service.flightTickets;

import java.util.List;

import cn.smbms.pojo.FlightTickets;

public interface FlightTicketsService {
	/*
	 * 
	 * 查询机票信息
	 * */
	public List<FlightTickets>  getticketsById(String flightId);

}
