package work.restApi2.StaticDyanamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DyanamicApi {

    @Autowired
    DyanamicController dc;

    @GetMapping("/dynamic")
    public MappingJacksonValue getDyanamicDatalist(){
       return dc.giveValue1();
    }

    @GetMapping("/dynamic2")
    public MappingJacksonValue getDyanamicDatalist2(){
        return dc.giveValue2();
    }

    @PostMapping("/dynamic")
    public String AddToDyanamicDta(@RequestBody Dyanamicdata d1){

        return dc.addToFile(d1);
    }
}
