package cn.ibona.springcloudprojectprovider8082;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.ibona.springcloudprojectprovider8082.mapper")
public class SpringcloudProjectProvider8082Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProjectProvider8082Application.class, args);
    }
}
