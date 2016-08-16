package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootAwsApplication.class)
@WebAppConfiguration
public class SpringBootAwsApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testGreeting() {
		Greeting greet = new Greeting(1, "Hello");
		Assert.assertEquals(greet.getContent(), "Hello");
		Assert.assertEquals(greet.getId(), 1);
		
	}

}
