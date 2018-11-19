package cn.ibona.springcloudprojectproviderhystrix8081;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("cn.ibona.springcloudprojectproviderhystrix8081.mapper")
public class SpringcloudProjectProviderHystrix8081Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProjectProviderHystrix8081Application.class, args);
    }
}
