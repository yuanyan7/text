package cn.smbms.pojo;

public class FlightTickets {
	private Integer id;//机票 id
	private Integer flightId;//航班 id
	private Integer ticketPrice;//票价
	private String sellCompany;//售票单位
	public FlightTickets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightTickets(Integer id, Integer flightId, Integer ticketPrice, String sellCompany) {
		super();
		this.id = id;
		this.flightId = flightId;
		this.ticketPrice = ticketPrice;
		this.sellCompany = sellCompany;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public Integer getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getSellCompany() {
		return sellCompany;
	}
	public void setSellCompany(String sellCompany) {
		this.sellCompany = sellCompany;
	}
	
	

}
