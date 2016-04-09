package es.urjc.code.dad.configserver;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigServerApplication.class)
@WebAppConfiguration
@IntegrationTest
public class ConfigServerApplicationTests {

	@Test
	public void contextLoads() {
		
		ResponseEntity<String> response = 
			new TestRestTemplate()
				.getForEntity("http://localhost:8888/dad-application.properties", String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("server.port: 9090", response.getBody());
		
	}

}
