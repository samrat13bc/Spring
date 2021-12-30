package com.test;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/login")
public class WebServices {
	
	@POST
	@Path("/webapp")
	public Response sayHello(
		@FormParam("userid") String userid)
	{
		return Response.status(200)	
				.entity("Hi " +userid+" Welcome to our webpage")
				.build();
	}

}
