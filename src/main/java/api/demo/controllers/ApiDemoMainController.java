package api.demo.controllers;

import java.net.http.HttpResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ApiDemoMainController {

	@PostMapping(value = "welcome")
	public ResponseEntity<String> greatUser(@RequestBody String name)
	{
		String message="Hello "+name;
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
