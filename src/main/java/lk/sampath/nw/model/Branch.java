package lk.sampath.nw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="branch")
public class Branch {

	private int id;
	private String name;
	private String address;
	private String contact_no;
	private String manager_id;
	private String no_of_employees;
	private int type;
	
	protected Branch() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getContact_no() {
		return contact_no;
	}
	
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	
	public String getManager_id() {
		return manager_id;
	}
	
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	
	public String getNo_of_employees() {
		return no_of_employees;
	}
	
	public void setNo_of_employees(String no_of_employees) {
		this.no_of_employees = no_of_employees;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
