package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.GetClientByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetClientByIdController {
    @Autowired
    GetClientByIdService service;
    @GetMapping("api/mext/client/")
    public JsonNode getclientbyidmext(@RequestParam("id") Integer id) { return service.getclientbyidmext(id);}
}