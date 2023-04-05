package work.restApi2.Versioning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserrDeploy {

    @Autowired
    UserController ud;

    @GetMapping("/v1/user")
    public List<User1>GetVersion1(){
       return ud.getUser1();
    }
    @PostMapping("/v1/user")
    public String AddVersion1(@RequestBody User1 u){
        ud.addUser1(u);
        return "user added";
    }


    @GetMapping("/v2/user")
    public List<AdvanceUser>GetAdvanceVersion1(){
        return ud.getAdvanceUser();
    }
    @PostMapping("/v2/user")
    public String AddAdvanceVersion1(@RequestBody AdvanceUser u){
        ud.addAdvanceUser1(u);
        return "new user added";
    }


    // via param
    @GetMapping(path="/v1/user",params = "version1")
    public List<User1>GetVersion1Param(){
        return ud.getUser1();
    }

    @GetMapping(path="/v2/user",params = "version2")
    public List<AdvanceUser>GetAdvanceVersion1Param(){
        return ud.getAdvanceUser();
    }


    // via  header

    @GetMapping(path="/user/header",headers = "API=1")
    public List<User1>GetVersion1Header(){
        return ud.getUser1();
    }

    @GetMapping(path="/user/header",headers = "API=2")
    public List<AdvanceUser>GetAdvanceVersion1Header(){
        return ud.getAdvanceUser();
    }



    // via mime

    @GetMapping(path="/user/mime",produces = "application/vnd.company.app-version1+json")
    public List<User1>GetVersion1Mime(){
        return ud.getUser1();
    }

    @GetMapping(path="/user/mime2",headers = "application/version2")
    public List<AdvanceUser>GetAdvanceVersion1Mime(){
        return ud.getAdvanceUser();
    }
}
