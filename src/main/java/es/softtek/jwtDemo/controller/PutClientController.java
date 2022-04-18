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
public class PutClientController {
    @Autowired
    PutContractService service;
    @PutMapping ("api/mext/putclient/{id}")
    public void putclientmext(@RequestParam("tradename") String tradename,
                                @RequestParam("address") String address,
                                @RequestParam("sector") String sector,
                                @RequestParam("accountManager") String accountManager,
                                @RequestParam("firstContactUser") String firstContactUser,
                                @RequestParam("firstContactEmail") String firstContactEmail,
                                @RequestParam("firstContactPhone") String firstContactPhone,
                                @RequestParam("note") String note,
                                @RequestParam("organisation") String organisation,@RequestParam("active") boolean active) {


    }
}
