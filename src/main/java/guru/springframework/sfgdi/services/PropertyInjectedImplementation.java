package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedImplementation implements GreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hello PropertyInjectionImplementation";
	}

	
}
