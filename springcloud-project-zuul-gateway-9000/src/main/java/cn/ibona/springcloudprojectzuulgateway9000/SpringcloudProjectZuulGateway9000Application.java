package cn.ibona.springcloudprojectzuulgateway9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringcloudProjectZuulGateway9000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProjectZuulGateway9000Application.class, args);
    }
}