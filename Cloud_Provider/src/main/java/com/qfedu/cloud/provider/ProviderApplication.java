package com.qfedu.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@Author feri
 *@Date Created in 2019/6/12 10:18
 */
@SpringBootApplication
@EnableEurekaClient  //标记这是一个客户端
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }

}
