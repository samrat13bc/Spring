package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Helloservices {
	
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayWelcomePlainText() 
	{
		return "Hey Welcome to the Rest API Plain Text response";
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayWelcomeHtml()
	{
		return "<html><body><h1>Hi welcome to html response</h1></body></html>";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	
	public String sayWelcomeXML() 
	{
		return "<?xmlversion =\"1.0\" encoding=\"UTF-8\"?>"+"<cgi> Hi welcome to xml response"+"</cgi>";
	}
	
	
	
}
	
