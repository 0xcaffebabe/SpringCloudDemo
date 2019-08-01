package wang.ismy.springgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class SpringGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGatewayApplication.class, args);
    }


}
