package com.rsystems.shareprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SharePriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharePriceApplication.class, args);
	}
}
