package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class EmpController extends ActionSupport{

	private String name, email, address;

	public String getName() {
		return name;
	}
	@RequiredStringValidator(key="msg1")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	@RequiredStringValidator(key="msg2")
	@EmailValidator(key="msg3")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}
	@RequiredStringValidator(key="msg4")

	public void setAddress(String address) {
		this.address = address;
	}

	public String execute() throws Exception {

//	controller code can be written here
	return "success";
}
}
