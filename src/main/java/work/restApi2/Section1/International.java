package work.restApi2.Section1;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class International {
    private MessageSource ms;

    public International(MessageSource ms){
        this.ms=ms;
    }
    @GetMapping("/print")
    public String getInternation(){ //
        Locale locale= LocaleContextHolder.getLocale();// this is used for by Accept Header to
        //identify which application properties to pick.
        return ms.getMessage("haveniceday.message",null,"default_mssg",locale);

    }
}
