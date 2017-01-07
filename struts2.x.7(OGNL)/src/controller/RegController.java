package controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class RegController extends ActionSupport {
	private String name,email,address;
	@RequiredStringValidator(message="name is required") 
	public void setName(String name) {
		this.name = name;
	}
	@RequiredStringValidator(message="name is required") 
	@EmailValidator(message="email format is wrong") 
	public void setEmail(String email) {
		this.email = email;
	}
	@RequiredStringValidator(message="address is required") 
	public void setAddress(String address) {
		this.address = address;
	}
	

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String execute() throws Exception
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("req_name",name);
		request.setAttribute("req_email",email);
		request.setAttribute("req_address",address);
		
		HttpSession session=request.getSession();
		session.setAttribute("session_name",name);
		session.setAttribute("session_email",email);
		session.setAttribute("session_address",address);

		ServletContext sctxt= ServletActionContext.getServletContext();
		sctxt.setAttribute("context_name",name);
		sctxt.setAttribute("context_email",email);
		sctxt.setAttribute("context_address",address);
		
		ValueStack vs=ServletActionContext.getValueStack(request);
		Map m=new HashMap();
		m.put("vs_name",name);
		m.put("vs_email",email);
		m.put("vs_address",address);
//		We need to push the map which is the only acceped into vs to display using valuestack scope
		vs.push(m);
		return "success";
		
	}
	
}
