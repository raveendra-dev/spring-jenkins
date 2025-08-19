package spring_jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	public Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Testcase executing");
		logger.info("UAT testing");

		assertEquals(true, true);
	}

}
