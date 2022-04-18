package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.GetClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetClientController {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail() {
        String from = "sender@gmail.com";
        String to = "ahmedsilini@gmail.com@gmail.com";

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject("This is a plain text email");
        message.setText("Hello guys! This is a plain text email.");

        mailSender.send(message);

    }
    @Autowired
    GetClientService service4;
    @GetMapping("api/mext/client/all")
    public JsonNode getclientmext() {
        return service4.getclientmext();
    }
}

