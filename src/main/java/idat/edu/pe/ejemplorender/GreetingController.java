package idat.edu.pe.ejemplorender;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

private static final String template = "SL75094270, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/saludo")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Cristian Anticona") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	

}
