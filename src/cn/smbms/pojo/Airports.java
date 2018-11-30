package cn.smbms.pojo;

public class Airports {
	private Integer id;//机场 id
	private String airportName;//机场名称
	private String cityName;//所属城市
	public Airports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airports(Integer id, String airportName, String cityName) {
		super();
		this.id = id;
		this.airportName = airportName;
		this.cityName = cityName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	

}
