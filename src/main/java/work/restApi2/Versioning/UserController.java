package work.restApi2.Versioning;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserController {
    List<User1> l1=new ArrayList<>();
    List<AdvanceUser>l2=new ArrayList<>();


    public List<User1>getUser1(){
        return l1;
    }
    public List<AdvanceUser>getAdvanceUser() {
        return l2;
    }

    public void addUser1(User1 u){
        l1.add(u);
    }

    public void addAdvanceUser1(AdvanceUser u){
        l2.add(u);
    }
}
