package wang.ismy.consulconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    DiscoveryClient discoveryClient;

    // 获取相关服务实例
    @RequestMapping("/services")
    public Object services(){
        return discoveryClient.getInstances("producer");
    }

    // 自动选择服务实例
    @RequestMapping("/discover")
    public Object discover(){
        return loadBalancerClient.choose("producer").getUri().toString();
    }

    @RequestMapping("/hi")
    public String hi(){
        ServiceInstance instance = loadBalancerClient.choose("producer");

        return new RestTemplate().getForObject(instance.getUri().toString()+"/hi",String.class);
    }
}
