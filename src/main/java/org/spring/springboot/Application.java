package org.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.tsf.annotation.EnableTsf;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 09/29/2017.
 */
// Spring Boot 应用的标识
@SpringBootApplication
@EnableTsf
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
}
