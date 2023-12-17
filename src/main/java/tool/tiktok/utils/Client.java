/**
 * 
 */
package tool.tiktok.utils;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

/**
 * @author dung.nguyenvan1
 *
 */
@Component
public class Client {

	private static RestTemplate client;
	private static Gson gson;
	private static HttpHeaders headers;
	private static HttpEntity entity;

	public Client(RestTemplate client) {
		Client.client = client;
		gson = new Gson();
		headers = new HttpHeaders();
		entity = new HttpEntity(headers);
	}

	public static ResponseEntity<String> getAccessToken(Map<String, String> params) {
		return client.exchange("https://open-api.tiktok.com/oauth/access_token/", HttpMethod.POST, entity, String.class,
				params);
	}
}
