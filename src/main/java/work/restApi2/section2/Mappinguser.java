package work.restApi2.section2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Mappinguser {

    //*********commented the dependency of jakson so that no error occur in future Question
    List<User>l1=new ArrayList<>();

    @GetMapping("/userval")
    public List<User>getuser(){
        return l1;
    }
    @PostMapping("/userval")
    public String adduser(@RequestBody User u){
        l1.add(u);
        return "user Added";
    }
}
