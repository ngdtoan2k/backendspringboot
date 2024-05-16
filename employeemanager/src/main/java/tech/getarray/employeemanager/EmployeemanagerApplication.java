package tech.getarray.employeemanager;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


import java.util.Arrays;

@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowCredentials(true);
		configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		configuration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin",
				"authorization", "content-type","Accept","Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method","Access-Control-Request-Headers"));
		configuration.setExposedHeaders(Arrays.asList("Origin","authorization", "content-type","Accept",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin","Access-Control-Allow-Credentials"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));

		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", configuration);
		return new CorsFilter();
	}

}
