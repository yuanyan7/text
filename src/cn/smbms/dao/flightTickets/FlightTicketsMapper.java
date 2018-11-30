package cn.smbms.dao.flightTickets;

import java.util.List;

import cn.smbms.pojo.FlightTickets;

public interface FlightTicketsMapper {
	/*
	 * 
	 * 查询机票信息
	 * */
	public List<FlightTickets>  getticketsById(String flightId);

}
