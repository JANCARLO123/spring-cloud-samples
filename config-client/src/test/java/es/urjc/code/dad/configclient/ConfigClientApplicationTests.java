package es.urjc.code.dad.configclient;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigClientApplication.class)
@WebAppConfiguration
@IntegrationTest
public class ConfigClientApplicationTests {

	@Test
	public void portChanged() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, "application/json");
		ResponseEntity<String> response = new TestRestTemplate()
			.exchange("http://localhost:9090/greeting", HttpMethod.GET, new HttpEntity<>(headers), String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		
	}

}
