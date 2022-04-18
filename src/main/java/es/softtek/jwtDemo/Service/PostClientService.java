package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.util.Arrays;

@Service
public class PostClientService {
    @Autowired
    RestOperations restTemplate;
    public JsonNode postclientmext(Long id,String organisation,String tradeName, String address, String sector, String accountManager, String firstContactUser,
                                   String firstContactEmail, String firstContactPhone, String note,
                                   boolean active)
                                  {

        PostClient postClient=new PostClient(id,organisation,tradeName,address,sector,accountManager,firstContactUser,firstContactEmail, firstContactPhone, note,active);
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        JsonNode response=restTemplate.postForObject("http://localhost:8080/MeExt/api/v1/client",postClient,JsonNode.class);
        return response;
    }

}
