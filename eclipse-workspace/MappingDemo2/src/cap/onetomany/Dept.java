package cap.onetomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Dept implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int did;
	private String dname;
	private String dmgr;
	@OneToMany(mappedBy="d",cascade=CascadeType.ALL)
	Set<Employee> employees=new HashSet<>();
	
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployees(Employee e)
	{
		employees.add(e);
		e.setD(this);
	}
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDmgr() {
		return dmgr;
	}
	public void setDmgr(String dmgr) {
		this.dmgr = dmgr;
	}
	public int getDid() {
		return did;
	}
}
