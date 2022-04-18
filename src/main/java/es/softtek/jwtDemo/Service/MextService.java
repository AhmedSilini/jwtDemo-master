package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.util.Arrays;

@Service
public class MextService {
    @Autowired
    RestOperations restTemplate;
    public JsonNode loginmext(String username,String password){
        Credentials credentials=new Credentials(username, password);

        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));

        JsonNode response=restTemplate.postForObject("http://localhost:8080/MeExt/api/v1/auth/login",credentials,JsonNode.class);
        return response;
    }

}

