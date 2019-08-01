package wang.ismy.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TraceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceApplication.class, args);
    }

}
