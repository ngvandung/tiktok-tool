package tool.tiktok;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;

import tool.tiktok.utils.Client;

@SpringBootApplication
@ComponentScan("tool.tiktok")
public class TiktokApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TiktokApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Map<String, String> loginParams = new HashMap<>();
		loginParams.put("client_key", "awegi9kt0uhwcd8k");
		loginParams.put("client_secret", "UnqY7bKxHqEFRpPGYzmmyrovtRW7RhfY");
		loginParams.put("code", "Web");
		loginParams.put("grant_type", "authorization_code");

		ResponseEntity<String> response = Client.getAccessToken(loginParams);
		System.out.println(response);
	}

}
