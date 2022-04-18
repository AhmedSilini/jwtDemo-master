package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.PostClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddClientController {
    @Autowired
    PostClientService service;
    @PostMapping("api/mext/addclient")
    public JsonNode postclientmext(  @RequestParam("tradename") String tradename,
                                     @RequestParam("address") String address,
                                     @RequestParam("sector") String sector,
                                     @RequestParam("accountManager") String accountManager,
                                     @RequestParam("firstContactUser") String firstContactUser,
                                     @RequestParam("firstContactEmail") String firstContactEmail,
                                     @RequestParam("firstContactPhone") String firstContactPhone,
                                     @RequestParam("note") String note,@RequestParam("id") Long id,
                                     @RequestParam("organisation") String organisation,@RequestParam("active") boolean active) {
        return service.postclientmext(id,organisation,tradename,address,sector,accountManager,firstContactUser,
                                      firstContactEmail,firstContactPhone,note,active);

    }
}
