package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.GetContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetContractController {
    @Autowired
    GetContractService service4;
    @GetMapping("api/mext/contract/all")
    public JsonNode getcontractmext() {
        return service4.getcontractmext();
    }
}

