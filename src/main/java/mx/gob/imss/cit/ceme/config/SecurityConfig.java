/**
 * 
 */
package mx.gob.imss.cit.ceme.config;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * 
 */
@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(AbstractHttpConfigurer::disable)
				.authorizeHttpRequests(request -> 
				request.requestMatchers(antMatcher("/h2-console/**")).permitAll()
						.requestMatchers(antMatcher("/actuator/**")).permitAll()
						// .requestMatchers("/api/v1/auth/**").permitAll() // se modifica al subir aspring 3.1.3
						.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(manager -> manager.sessionCreationPolicy(STATELESS));
		return http.build();
	}

}
