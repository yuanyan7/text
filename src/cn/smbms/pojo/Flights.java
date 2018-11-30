package cn.smbms.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Flights {
	private Integer id;//航班 id
	private String flightCode;//航班编号
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date flightDate;//航班日期
	private String airline;//所属航空公司
	private String type;//机型
	private Integer takeoffAirportId;//起飞机场 id
	private Integer landingAirportId;//降落机场 id
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date takeoffTime;//起飞时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date landingTime;//降落时间
	private String flightTime;//飞行时长
	private String stopAirport;//经停机场
	private Integer referencePrice;//参考报价
	
	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flights(Integer id, String flightCode, Date flightDate, String airline, String type,
			Integer takeoffAirportId, Integer landingAirportId, Date takeoffTime, Date landingTime, String flightTime,
			String stopAirport, Integer referencePrice) {
		super();
		this.id = id;
		this.flightCode = flightCode;
		this.flightDate = flightDate;
		this.airline = airline;
		this.type = type;
		this.takeoffAirportId = takeoffAirportId;
		this.landingAirportId = landingAirportId;
		this.takeoffTime = takeoffTime;
		this.landingTime = landingTime;
		this.flightTime = flightTime;
		this.stopAirport = stopAirport;
		this.referencePrice = referencePrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTakeoffAirportId() {
		return takeoffAirportId;
	}

	public void setTakeoffAirportId(Integer takeoffAirportId) {
		this.takeoffAirportId = takeoffAirportId;
	}

	public Integer getLandingAirportId() {
		return landingAirportId;
	}

	public void setLandingAirportId(Integer landingAirportId) {
		this.landingAirportId = landingAirportId;
	}

	public Date getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(Date takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

	public Date getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(Date landingTime) {
		this.landingTime = landingTime;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getStopAirport() {
		return stopAirport;
	}

	public void setStopAirport(String stopAirport) {
		this.stopAirport = stopAirport;
	}

	public Integer getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(Integer referencePrice) {
		this.referencePrice = referencePrice;
	}
	
	

}
