package work.restApi2.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import work.restApi2.section2.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserrDeploy {
    List<User1>l1=new ArrayList<>();
    List<AdvanceUser>l2=new ArrayList<>();
    @GetMapping("/v1/user")
    public List<User1>getversion1(){
        return l1;
    }
    @PostMapping("/v1/user")
    public String addversion1(@RequestBody User1 u){
        l1.add(u);
        return "user added";
    }


    @GetMapping("/v2/user")
    public List<AdvanceUser>getadvanceversion1(){
        return l2;
    }
    @PostMapping("/v2/user")
    public String addAdvanceversion1(@RequestBody AdvanceUser u){
        l2.add(u);
        return "new user added";
    }
    @GetMapping(path="/v1/user",params = "version1")
    public List<User1>getversion1Param(){
        return l1;
    }

    @GetMapping(path="/v2/user",params = "version2")
    public List<AdvanceUser>getadvanceversion1Param(){
        return l2;
    }

    @GetMapping(path="/user/header",headers = "API=1")
    public List<User1>getversion1header(){
        return l1;
    }

    @GetMapping(path="/user/header",headers = "API=2")
    public List<AdvanceUser>getadvanceversion1header(){
        return l2;
    }
}
