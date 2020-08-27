package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionImplementation implements GreetingService{

	private GreetingService geGreetingService;

	@Override
	public String sayGreeting() {
		return "Hello SetterInjectionImplementation";
	}

	 
	
}
