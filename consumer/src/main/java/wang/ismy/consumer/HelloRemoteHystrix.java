package wang.ismy.consumer;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "sorry,service call failed";
    }
}
