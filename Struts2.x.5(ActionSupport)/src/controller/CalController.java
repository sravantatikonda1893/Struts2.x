package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;

public class CalController extends ActionSupport 
{
private int fn;
private int sn;
private int tn;

@IntRangeFieldValidator(min="1",max="99999",message="First number should be between ${min} and ${max}")
public void setFn(int fn) {
	this.fn = fn;
}

@IntRangeFieldValidator(min="1",max="99999",message="second number should be between ${min} and ${max}")
public void setSn(int sn) {
	this.sn = sn;
}

public int getFn() {
	return fn;
}


public int getSn() {
	return sn;
}
// the method names are the prefixes of action attribute values

public String add() throws Exception
{
	tn=fn+sn;
	return "success";
}

public String sub() throws Exception
{
	tn=fn-sn;
	return "success";
}

public String mul() throws Exception
{
	tn=fn*sn;
	return "success";
}

public String div() throws Exception
{
	tn=fn/sn;
	return "success";
}
}
