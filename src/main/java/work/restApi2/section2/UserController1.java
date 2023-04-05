package work.restApi2.section2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserController1 {
    List<User> l1=new ArrayList<>();

    public void addUser(User u){
        l1.add(u);
    }
    public List<User>getUser(){
        return l1;
    }
    public String deleteUser(int id){
        l1.removeIf(e -> e.getId() == id);
        return "value deleted";
    }
}