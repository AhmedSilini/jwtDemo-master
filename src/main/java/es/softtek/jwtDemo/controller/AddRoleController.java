package es.softtek.jwtDemo.controller;
import com.fasterxml.jackson.databind.JsonNode;
import es.softtek.jwtDemo.Service.AddRoleService;
import es.softtek.jwtDemo.Service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddRoleController {
    @Autowired
    AddRoleService service1;
    @PostMapping("api/mext/addrole")
    public JsonNode addUserMext(@RequestParam("role") String role) {
        return service1.addRoleMext(role);

    }
}
