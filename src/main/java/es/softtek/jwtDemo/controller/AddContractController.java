package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.PostClient;
import es.softtek.jwtDemo.Service.PostContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AddContractController {
    @Autowired
    PostContractService service;
    @PostMapping("api/mext/addcontract")
    public JsonNode postcontractmext(@RequestParam("id") Long id,@RequestParam("title") String title,
                                     @RequestParam("description") String description,
                                     @RequestParam("commercial") String commercial, @RequestParam("type") String type,
                                     @RequestParam("client") PostClient client,
                                     @RequestParam("startDate") Date startDate,
                                     @RequestParam("endDate") Date endDate, @RequestParam("note") String note,
                                     @RequestParam("active") boolean active) {
        return service.postcontractmext( id,title,  description,  commercial, type,client,
                startDate,  endDate,  note,active);

    }
}
