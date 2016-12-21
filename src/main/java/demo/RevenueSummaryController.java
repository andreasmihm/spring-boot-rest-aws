package demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/revenue")
public class RevenueSummaryController {

    private static final String template = "Hello , %s! This is your business API";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public RevenueSummary revenue(@RequestParam(value="month", defaultValue="") String month) {
		//PiSlow.calc();
		return new RevenueSummary(month);
    }
	
}