package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService; 
	
	public String getGreeting() {
		return "Hello this is line 10 " + greetingService.sayGreeting(); 
	}
	
}
