package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetContractByIdController {
    @Autowired
    GetContractByIdController service;
    @GetMapping("api/mext/contract/")
    public JsonNode getcontractbyidmext(@RequestParam("id") Integer id) { return service.getcontractbyidmext(id);}
}