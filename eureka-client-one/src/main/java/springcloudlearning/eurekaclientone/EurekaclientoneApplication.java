package springcloudlearning.eurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclientoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientoneApplication.class, args);
    }

}
