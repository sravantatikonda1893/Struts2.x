package controller;

import com.opensymphony.xwork2.ActionSupport;

public class HelloController extends ActionSupport {
private String name;
private String msg;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String execute() throws Exception{
	msg="Hello..."+name;
	return "success";
}
}
