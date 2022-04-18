package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
    @Autowired
    AddUserService service1;
    @PostMapping("api/mext/adduser")
    public JsonNode addUserMext(@RequestParam("emailid") String emailid, @RequestParam("site") String site,
                                @RequestParam("account") String account, @RequestParam("isVIPUser") Boolean isVIPUser,
                                @RequestParam("CostPerHour") Float CostPerHour, @RequestParam("lastName") String lastName,
                                @RequestParam("firstName") String firstName, @RequestParam("loginName") String loginName,
                                @RequestParam("userpassword") String userpassword, @RequestParam("role") String[] role) {
        return service1.addUserMext(emailid,site,account,isVIPUser,CostPerHour,lastName,firstName,loginName,userpassword,role);

    }
}
