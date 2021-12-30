package com.test;

import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;


import javax.ws.rs.core.Response;

@Path("/social")
public class Webservices {
	
	@POST  
    @Path("/login")  
    public Response loginUser(  
        @FormParam("userid") String userid)  
         
        {  
   
        return Response.status(200)  
            .entity(" Login successfull!"+" Hey "+userid+" Welcome to our Website !!!")  
            .build();  
    } 
	
	@POST  
    @Path("/register")  
    public Response registerUser(  
        @FormParam("userid") String userid)  
         
        {  
   
        return Response.status(200)  
            .entity(" Registration successfull!"+" Hey "+userid+" Check ur mail for further details !!!")  
            .build();  
    }  

}
