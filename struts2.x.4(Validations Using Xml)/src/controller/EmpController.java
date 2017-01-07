package controller;

import com.opensymphony.xwork2.ActionSupport;

public class EmpController extends ActionSupport{

	private String name, email, address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String execute() throws Exception {

//	controller code can be written here
	return "success";
}
}
