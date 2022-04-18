package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class PutContractService {
    @Autowired
    RestOperations restTemplate;
    public void putcontractmext(String title, String description, String commercial, String type,
                                    PostClient client, Date startDate, Date endDate, String note, boolean active)
        {
        PostContract putContract=new PostContract(title,  description,  commercial,  type,client,
                                                  startDate,  endDate,  note,active);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<PostContract> httpEntity = new HttpEntity<PostContract>(putContract, headers);
        ResponseEntity<PostContract> responseEntity = restTemplate.exchange("http://localhost:8081/api/mext/putcontract/{id}", HttpMethod.PUT, httpEntity, PostContract.class);
        }

}


