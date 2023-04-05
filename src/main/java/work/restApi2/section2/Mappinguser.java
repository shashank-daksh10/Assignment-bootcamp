package work.restApi2.section2;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mappinguser {

    @Autowired
    UserController1 uc;


    //*********commented the dependency of jakson so that no error occur in future Question

    @Operation(summary = "Get Users Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "details added Successfully.",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class))})})


    @GetMapping("/user-val")
    public List<User> getUser() {
        return uc.getUser();
    }

    @PostMapping("/user-val")
    public String addUser(@RequestBody User u) {
        uc.addUser(u);
        return "user Added";
    }

    @DeleteMapping("/user-val/{id}")
    public String deletedValue(@PathVariable int id) {
        return uc.deleteUser(id);
    }
}
