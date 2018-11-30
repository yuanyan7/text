package cn.smbms.dao.airports;

import java.util.List;

import cn.smbms.pojo.Airports;

public interface AirportsMapper {
	//根据id查询航班
	public List<Airports> getairportById(int id);

}
