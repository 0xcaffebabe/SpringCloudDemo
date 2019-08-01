package wang.ismy.gateway;

import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ZuulFilter zuulFilter(){
        return new MyFilter();
    }
}
