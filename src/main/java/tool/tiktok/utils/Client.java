/**
 * 
 */
package tool.tiktok.utils;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author dung.nguyenvan1
 *
 */
@Component
public class Client {

	private static RestTemplate client;

	public Client(RestTemplate client) {
		Client.client = client;
	}

	public static ResponseEntity<?> post(String url, Object obj, Class<?> clazz) {
		return client.postForEntity(url, obj, clazz);
	}
}
