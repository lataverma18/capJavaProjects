package cap.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	@OneToOne(mappedBy="address")
	private Employee emp;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getAid() {
		return aid;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", address=" + address + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}
}
