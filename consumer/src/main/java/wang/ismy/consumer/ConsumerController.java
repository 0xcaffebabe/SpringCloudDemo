package wang.ismy.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hi")
    public String hi(){
        return helloRemote.hello("my");
    }

}
