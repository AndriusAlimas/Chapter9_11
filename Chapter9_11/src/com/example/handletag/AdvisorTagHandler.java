package com.example.handletag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

// SimpleTagSupport implements things we need in custom tags:
public class AdvisorTagHandler extends SimpleTagSupport{
	// this is for attribute, this tag has attribute and you need some how to deal with it:
	private String user;
	
	// Container calls this method to set the value from the tag attribute. It uses JavaBean property naming
	// conventions to figure out that a "user" attribute should be sent to the setUser() method:
	public void setUser(String user){
		this.user = user;
	}
	
	// The Container calls doTag() when the JSP invokes the tag using the name declared in the TLD
	public void doTag()throws JspException,IOException{
		JspWriter out = getJspContext().getOut();
		out.write("Hello " + user + " <br>");
		out.write("Your advice is: " + getAdvice());
	}
	
	// Our own internal private method
	private String getAdvice(){
		String[] adviceStrings = {"That color's not working for you.", "You should call in sick.",
				"You might want to rethink that haircut."};
		int random = (int)(Math.random() * adviceStrings.length);
		
		return adviceStrings[random];
		}
	
}

