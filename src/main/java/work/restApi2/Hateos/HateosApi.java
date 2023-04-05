package work.restApi2.Hateos;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    HateosController hd;
    List<student> list = new ArrayList<>();

    @PostMapping("/student")
    public String addStudent(@RequestBody student s) {
        hd.AddData(s);
        return "Student added";
    }

    @GetMapping("/student")
    public List<student> allstudent() {
        return hd.getData();
    }

    @GetMapping("/student/{id}")
    public EntityModel<student> getSpecific(@PathVariable int id) {
        return hd.giveEntity(id);
    }
}
