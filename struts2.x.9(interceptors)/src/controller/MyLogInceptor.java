package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyLogInceptor implements Interceptor {

	public void init() {
		//Initialization code		
	}



	public String intercept(ActionInvocation ai) throws Exception 
	{
		Log l=LogFactory.getLog(HelloController.class);
//pre controller execute code
		l.info("**in time******");
String res=ai.invoke();
//post controller execute code

l.info("*****out time******");
	

return null;
	}
	public void destroy() {
		//		destroy code
	}


}
