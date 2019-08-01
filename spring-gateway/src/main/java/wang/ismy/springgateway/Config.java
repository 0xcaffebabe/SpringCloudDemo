package wang.ismy.springgateway;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Configuration
public class Config {

    @Bean
    KeyResolver userKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
