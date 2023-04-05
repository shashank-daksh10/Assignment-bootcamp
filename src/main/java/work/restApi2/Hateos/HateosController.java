package work.restApi2.Hateos;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
public class HateosController {
    List<student> l1=new ArrayList<>();

    public void AddData(student s){
        l1.add(s);
    }

    public List<student> getData() {
        return l1;

    }
    public EntityModel<student>giveEntity(int id){
        student s = l1.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        if (s == null) {
            throw new StudentException("no element" + id);
        }
        EntityModel<student> ent = EntityModel.of(s);
        WebMvcLinkBuilder wbc = linkTo(methodOn(this.getClass()).getData());
        ent.add(wbc.withRel("all-student"));


        return ent;
    }
}
