package com.qfedu.cloud.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *@Author feri
 *@Date Created in 2019/6/3 14:45
 * Swagger设置
 */
@Configuration //标记这是一个配置
public class SwaggerConfig {

    public ApiInfo createA(){
        ApiInfo info=new ApiInfoBuilder().title("新闻app数据接口").
                contact( new Contact("Java1901","http://1000phone.com","xingfei_work@163.com")).
                description("实现一个新闻项目的数据接口信息").build();
        return info;
    }
    @Bean//创建对象  修饰方法 方法的返回值必须是引用类型  对象存储在IOC容器
    public Docket createDocket(){
       Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().
               apis(RequestHandlerSelectors.basePackage("com.qfedu.cloud.consumer.controller")).build();
       return docket;

    }
}
