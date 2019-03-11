/*
 * Copyright (c) 2019. For Pheiot com
 */


package com.pheiot.phecloud.eurakadiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Peter Li
 * @Description  注册中心启动类
 * @Date 2019/3/11
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurakaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaDiscoveryApplication.class, args);
	}
}
