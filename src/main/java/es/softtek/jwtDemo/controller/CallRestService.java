/*package es.softtek.jwtDemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import es.softtek.jwtDemo.dto.User;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class CallRestService {
    @PostMapping(value = "/http://localhost:8080/MeExt/api/v1/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User callRestService(@RequestBody JSONArray message) throws RestClientException, JsonProcessingException {
        JSONArray array = new JSONArray();
        JSONObject item = new JSONObject();
        item.put("username", "lool");
        item.put("password", "mdr");
        array.put(item);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(
                "http://localhost:8080/MeExt/api/v1/auth/login",
                item,
                User.class);
    }
}*/