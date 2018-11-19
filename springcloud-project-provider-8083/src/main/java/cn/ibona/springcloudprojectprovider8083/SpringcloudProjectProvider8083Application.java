package cn.ibona.springcloudprojectprovider8083;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.ibona.springcloudprojectprovider8083.mapper")
public class SpringcloudProjectProvider8083Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProjectProvider8083Application.class, args);
    }
}
