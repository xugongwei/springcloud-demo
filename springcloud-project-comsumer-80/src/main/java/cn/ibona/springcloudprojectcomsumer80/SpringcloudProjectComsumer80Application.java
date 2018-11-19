package cn.ibona.springcloudprojectcomsumer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringcloudProjectComsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProjectComsumer80Application.class, args);
    }
}
