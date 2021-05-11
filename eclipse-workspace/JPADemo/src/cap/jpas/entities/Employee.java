package cap.jpas.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.FilterJoinTable;
import org.hibernate.annotations.GeneratorType;

@Entity
//@Table(name="Emp")

@NamedQueries(@NamedQuery(name="getAllEmps",query="select emp from Employee emp"))
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="empId")
	private int eId;
	private String eName;
	private int eSalary;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
}
