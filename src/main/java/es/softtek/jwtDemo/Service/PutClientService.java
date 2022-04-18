package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class PutClientService {
    @Autowired
    RestOperations restTemplate;
    public void putclientmext(String tradename,String address,String sector,String accountManager,String firstContactUser,
                              String firstContactEmail,String firstContactPhone,String note,String organisation,
                              boolean active)
    {
        PostClient putClient=new PostClient(tradename,  address,  sector,  accountManager,firstContactUser,
                firstContactEmail,firstContactPhone,note,organisation,active);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<PostClient> httpEntity = new HttpEntity<PostClient>(putClient, headers);
        ResponseEntity<PostClient> responseEntity = restTemplate.exchange("http://localhost:8081/api/mext/putclient/{id}", HttpMethod.PUT, httpEntity, PostClient.class);
    }

}


