package es.urjc.code.dad.configclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting() {
		return "hello";
	}
}
