package springAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	private String empname;
	
	private int empid;
	
	private int empsal;
	
	@Autowired
	private Address add;
	
	

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empsal=" + empsal + ", empadd=" + add + "]";
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public Address getAdd() {
		return add;
	}

	public void setadd(Address add) {
		this.add = add;
	}

	public Employee(String empname, int empid, int empsal, Address add) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
		this.add = add;
	}
	
	

}
