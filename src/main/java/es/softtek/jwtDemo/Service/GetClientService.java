package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.util.Arrays;

@Service
public class GetClientService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail() {
        String from = "sender@gmail.com";
        String to = "ahmedsilini@gmail.com";

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject("This is a plain text email");
        message.setText("Hello guys! This is a plain text email.");

        mailSender.send(message);

    }
    @Autowired
    RestOperations restTemplate;
    public JsonNode getclientmext(){
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        JsonNode response3=restTemplate.getForObject("http://localhost:8080/MeExt/api/v1/client/all",JsonNode.class);
        return response3;
    }

}


