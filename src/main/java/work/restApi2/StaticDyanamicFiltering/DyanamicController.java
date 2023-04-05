package work.restApi2.StaticDyanamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;
import work.restApi2.Versioning.AdvanceUser;

import java.util.ArrayList;
import java.util.List;

@Service
public class DyanamicController {
    List<Dyanamicdata> List= new ArrayList<>();
    public MappingJacksonValue giveValue1(){
        MappingJacksonValue mp =new MappingJacksonValue(List);
        SimpleBeanPropertyFilter myfilter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter",myfilter);
        mp.setFilters(flr);
        return mp;
    }

    public MappingJacksonValue giveValue2(){
        MappingJacksonValue mp =new MappingJacksonValue(List);
        SimpleBeanPropertyFilter myfilter=SimpleBeanPropertyFilter.filterOutAllExcept("field2");
        FilterProvider flr = new SimpleFilterProvider().addFilter("dynamicFilter",myfilter);
        mp.setFilters(flr);
        return mp;
    }
    public String addToFile(Dyanamicdata u){
        List.add(u);
        return "user added";
    }
}
