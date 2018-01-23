package demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello , %s! This is your business API";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		//PiSlow.calc();
		return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), "blah text");
    }
	
	@RequestMapping(method = RequestMethod.POST)
	public Greeting add(@RequestBody Greeting greeting) {
		Greeting g1 = new Greeting(1, "fjh", "more blah text");
		g1.getContent();
	   return greeting;
	}
}