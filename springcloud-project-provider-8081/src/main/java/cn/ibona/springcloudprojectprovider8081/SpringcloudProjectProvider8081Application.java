package cn.ibona.springcloudprojectprovider8081;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("cn.ibona.springcloudprojectprovider8081.mapper")
@SpringBootApplication
public class SpringcloudProjectProvider8081Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProjectProvider8081Application.class, args);
    }
}
