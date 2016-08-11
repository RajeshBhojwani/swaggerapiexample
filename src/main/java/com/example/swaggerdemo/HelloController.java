package com.example.swaggerdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

import scala.util.parsing.json.JSONObject;


@RestController
public class HelloController {
	@RequestMapping(method=RequestMethod.GET,value="swagger/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(httpMethod = "GET", value = "Hello Swagger API")
	public String sayHello() {
	//	JSONObject json = new JSONObject();
	//	json.put("hello", "Hello from Rajesh");
		return " { \"name\": \"Hello from Rajesh\" }";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="swagger/bye", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(httpMethod = "POST", value = "Hello Swagger API")
	public String byeBye() {
	//	JSONObject json = new JSONObject();
	//	json.put("hello", "Hello from Rajesh");
		return " { \"name\": \"Have a nice day\" }";
	}

}
