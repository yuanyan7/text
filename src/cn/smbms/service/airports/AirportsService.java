package cn.smbms.service.airports;

import java.util.List;

import cn.smbms.pojo.Airports;

public interface AirportsService {
	//根据id查询航班
	public List<Airports> getairportById(int id);

}
