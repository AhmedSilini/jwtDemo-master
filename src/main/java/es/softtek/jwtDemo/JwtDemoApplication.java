package es.softtek.jwtDemo;
import es.softtek.jwtDemo.Service.EmailSenderService;
import es.softtek.jwtDemo.security.JWTAuthorizationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class JwtDemoApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	static
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				    .antMatchers(HttpMethod.POST, "/api/mext/login").permitAll()
					.antMatchers(HttpMethod.POST, "/api/mext/adduser").permitAll()
					.antMatchers(HttpMethod.POST, "/api/mext/Client").permitAll()
					.antMatchers(HttpMethod.POST, "/api/mext/Contract").permitAll()
					.antMatchers(HttpMethod.POST, "/api/mext/Client/{id}").permitAll()
					.antMatchers(HttpMethod.POST, "/api/mext/Contract/{id}").permitAll()
				.anyRequest().permitAll();
		}
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("ahmed.silini@ensi-uma.tn","this is a test","this is body");}
}

