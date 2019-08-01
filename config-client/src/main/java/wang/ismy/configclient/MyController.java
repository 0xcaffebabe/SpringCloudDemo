package wang.ismy.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RefreshScope
    public class MyController {

        @Value("${config.hello}")
        private String port;

        @RequestMapping("/hello")
        public String hello(){
            return port;
        }
    }
