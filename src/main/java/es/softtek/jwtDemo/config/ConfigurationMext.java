package es.softtek.jwtDemo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationMext {
    @Bean
    public RestTemplate rest(){
        return new RestTemplateBuilder().build();
    }
}
