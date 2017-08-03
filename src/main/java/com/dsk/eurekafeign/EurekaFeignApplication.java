package com.dsk.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

//@ComponentScan({"com.dsk.eurekafeign.api.*"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages ={"client"})
public class EurekaFeignApplication {

	/*@LoadBalanced
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}
}
