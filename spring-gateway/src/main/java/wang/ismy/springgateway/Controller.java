package wang.ismy.springgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/error")
    public String error(){
        return "some error happen";
    }
}
