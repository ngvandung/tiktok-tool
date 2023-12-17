/**
 * 
 */
package tool.tiktok.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author dung.nguyenvan1
 *
 */
@Configuration
public class Configurations {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}