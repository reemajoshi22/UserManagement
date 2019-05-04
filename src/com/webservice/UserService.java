package com.webservice;
// specify a path for the web service using @Path annotation
//specify a path for the particular web service method using @Path annotation
import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/UserService") 

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<User> getUsers(){
	   System.out.println("UserService.getUsers()");
      return userDao.getAllUsers(); 
   }  
}