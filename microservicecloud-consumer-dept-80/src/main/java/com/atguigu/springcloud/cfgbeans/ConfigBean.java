package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced //springcloud ribbon是基于Netflix Ribbon实现一套 客户端 负载均衡的工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public  IRule myRule() {
		return new RandomRule();
	}
	
}
