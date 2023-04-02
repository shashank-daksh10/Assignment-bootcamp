package work.restApi2.Section1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class PrintHello {


    @GetMapping("/hello/{name}")
    public String get(@PathVariable String name){

        return "hello Mr "+" "+name;
    }


}
