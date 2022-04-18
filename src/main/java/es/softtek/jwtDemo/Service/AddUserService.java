package es.softtek.jwtDemo.Service;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.util.Arrays;

@Service
public class AddUserService {
    @Autowired
    RestOperations restTemplate;
    public JsonNode addUserMext(String emailid, String site, String account, Boolean isVIPUser, Float CostPerHour, String lastName, String firstName, String loginName, String userpassword, String[] role)
    {
        AddUser addUser=new AddUser(emailid,site,account,isVIPUser,CostPerHour,lastName,firstName,loginName,userpassword,role);
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        JsonNode response1=restTemplate.postForObject("http://localhost:8080/MeExt/api/v1/auth/addUser",addUser,JsonNode.class);
        return response1;
    }

}
