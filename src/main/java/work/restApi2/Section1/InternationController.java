package work.restApi2.Section1;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Service
public class InternationController {
    private MessageSource ms;

    public InternationController(MessageSource ms){
        this.ms=ms;
    }

    public String getInternation(){ //
        Locale locale= LocaleContextHolder.getLocale();// this is used for by Accept Header to
        //identify which application properties to pick.
        return ms.getMessage("haveniceday.message",null,"default_mssg",locale);

    }
}
