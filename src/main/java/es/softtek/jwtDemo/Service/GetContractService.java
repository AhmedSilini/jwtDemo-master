package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.util.Arrays;

@Service
public class GetContractService {
    @Autowired
    RestOperations restTemplate;
    public JsonNode getcontractmext(){
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        JsonNode response3=restTemplate.getForObject("http://localhost:8080/MeExt/api/v1/contract/all",JsonNode.class);
        return response3;
    }

}


