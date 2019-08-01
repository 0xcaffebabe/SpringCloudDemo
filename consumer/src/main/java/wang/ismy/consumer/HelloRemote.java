package wang.ismy.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam String name);
}
