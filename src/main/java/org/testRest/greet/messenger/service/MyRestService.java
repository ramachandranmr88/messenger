package org.testRest.greet.messenger.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.testRest.greet.messenger.model.Greeting;

@Path("myresource")
public class MyRestService
{
	private static final Logger logger = Logger.getLogger(MyRestService.class);
	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getMessage() {
		logger.info(" ----> Calling getMessage() method of MyRestService < ----");
		return new Greeting("Hello World from RESTful !!!!!");

	}

}