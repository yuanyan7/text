package cn.smbms.dao.flights;

import java.sql.Connection;
import java.util.List;

import org.jboss.logging.Param;

import cn.smbms.pojo.Flights;

public interface FlightsMapper {
	/**
	 * 根据条件查询航班信息,展示航班信息时需满足显示起降机场名称的要求
	 * 当以下面的方式进行写SQL语句时：
     *@Select("select column from table where userid = #{userid} ")
     *public int selectColumn(int userid);
     *
     *当你使用了使用@Param注解来声明参数时，如果使用 #{} 或 ${} 的方式都可以。
     *@Select("select column from table where userid = ${userid} ")
     *public int selectColumn(@Param("userid") int userid);
     *
	 *当你不使用@Param注解来声明参数时，必须使用使用 #{}方式。如果使用 ${} 的方式，会报错。
	 * 
	 *不使用@Param注解时，参数只能有一个，并且是Javabean。在SQL语句里可以引用JavaBean的属性，而且只能引用JavaBean的属性。
     *这里id是user的属性
     *@Select("SELECT * from Table where id = ${id}")
     *Enchashment selectUserById(User user); 
	 * */
	public List<Flights> getFlightsList( @Param("flightDate")String flightDate,
			@Param("takeoffAirportId") String takeoffAirportId,
			@Param("landingAirportId") String landingAirportId);
	/**
	 *  根据所有的航班信息
	 * 
	 * */
	public List<Flights> getFliList();

}
