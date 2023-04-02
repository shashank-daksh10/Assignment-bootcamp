package work.restApi2.Hateos;

import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class HateosApi {
    List<student> list=new ArrayList<>();

    @PostMapping("/student")
    public String addStudent(@RequestBody student s){
        list.add(s);
        return "Student added";
    }
    @GetMapping("/student")
    public List<student>allstudent(){
        return list;
    }
    @GetMapping("/student/{id}")
    public EntityModel<student>getSpecific(@PathVariable int id){
        student s=list.stream().filter(e->e.getId()==id).findFirst().orElse(null);
        if(s==null){
            throw new StudentException("no element"+id);
        }
        EntityModel<student>ent =EntityModel.of(s);
        WebMvcLinkBuilder wbc= linkTo(methodOn(this.getClass()).allstudent());
        ent.add(wbc.withRel("all-student"));
//        WebMvcLinkBuilder wbc=WebMvcLinkBuilder.linkTo(allstudent());
//        ent.add(wbc.withRel("all data"));

        return ent;
    }
}
