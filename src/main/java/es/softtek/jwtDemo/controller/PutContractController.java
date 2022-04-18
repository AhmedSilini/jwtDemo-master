package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.PostClient;
import es.softtek.jwtDemo.Service.PutContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class PutContractController {
    @Autowired
    PutContractService service;
    @PutMapping ("api/mext/putcontract/{id}")
    public void putcontractmext(@RequestParam("title") String title,
                                     @RequestParam("description") String description,
                                     @RequestParam("commercial") String commercial, @RequestParam("type") String type,
                                     @RequestParam("client") PostClient client,
                                     @RequestParam("startDate") Date startDate,
                                     @RequestParam("endDate") Date endDate, @RequestParam("note") String note,
                                     @RequestParam("active") boolean active) {


    }
}
