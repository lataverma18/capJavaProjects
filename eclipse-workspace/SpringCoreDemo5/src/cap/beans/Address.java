package cap.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address  //address 
{
	private String address;
	private String city;
	private String state;
	private int zipcode;
	public String getAddress() {
		return address;
	}
	public Address()
	{
		System.out.println("Address Constructor");
	}
	@Value("E-1368/50")
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	@Value("Gurugram")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("Hayrana")
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	@Value("122001")
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	

}
