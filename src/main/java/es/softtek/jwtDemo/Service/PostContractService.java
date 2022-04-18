package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostContractService {
    @Autowired
    RestOperations restTemplate;
    public JsonNode postcontractmext(Long id, String title, String description, String commercial, String type,
                                     PostClient client, Date startDate, Date endDate, String note, boolean active){
        PostContract postContract=new PostContract(id,title,  description,  commercial,  type,client,
                startDate,  endDate,  note,active);
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        JsonNode response3=restTemplate.postForObject("http://localhost:8080/MeExt/api/v1/contract",postContract,JsonNode.class);
        return response3;
    }

}


