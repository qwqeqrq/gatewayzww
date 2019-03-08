package com.qxmx.getrway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by zww on 2019-03-08.zuul网关启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GateWaySpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(GateWaySpringBoot.class, args);
    }
}
