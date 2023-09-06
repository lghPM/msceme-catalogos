package mx.gob.imss.cit.ceme;

import java.util.TimeZone;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MsCemeCatalogosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCemeCatalogosApplication.class, args);
	}

	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT-06:00"));
	}

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/msceme-catalogos/v1/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}

	@Bean
	ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		return modelMapper;
	}

	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Central de Mezclas").version("0.10")
				.description("WS Base para Cental de Mezclas"));
	}
}
