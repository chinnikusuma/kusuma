package chinni1;

public class address {
	private String strt;
	private String city;
	private String state;
	public address() {
		
	}
	public address(String strt, String city, String state) {
		
		this.strt = strt;
		this.city = city;
		this.state = state;
	}
	public String getStrt() {
		return strt;
	}
	public void setStrt(String strt) {
		this.strt = strt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void details()
	{
		System.out.println("Street:"+strt+"city:"+city+"State:"+state+"");
	}
	}


