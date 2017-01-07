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

// As this method wont return anything we need to configure it in struts.xml file with <result name="input"> in result tag
//This is a static validator check without using properties file. which is not available in struts 1.x
//	public void validate() 
//	{
//		if(name.equals(""))
//			addFieldError("name", "name is required");
//		if(email.equals(""))
//			addFieldError("email", "email is required");
//		if(address.equals(""))
//			addFieldError("address", "address is required");
//	}

	
//	Dynamic validation using properties file
	public void validate() 
	{
		if(name.equals(""))
			addFieldError("name", getText("msg1"));
		if(email.equals(""))
			addFieldError("email", getText("msg2"));
		if(address.equals(""))
			addFieldError("address", getText("msg3"));
	}

	public String execute() throws Exception {

//	controller code can be written here
	return "success";
}
}
