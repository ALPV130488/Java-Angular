package springAutowiring;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	private int honum;
	
	private String streetname;
	
	private String city;
	
	private int pincode;
	
	
	@Override
	public String toString() {
		return "Address [honum=" + honum + ", streetname=" + streetname + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHonum() {
		return honum;
	}

	public void setHonum(int honum) {
		this.honum = honum;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address(int honum, String streetname, String city, int pincode) {
		super();
		this.honum = honum;
		this.streetname = streetname;
		this.city = city;
		this.pincode = pincode;
	}
	
	


}
