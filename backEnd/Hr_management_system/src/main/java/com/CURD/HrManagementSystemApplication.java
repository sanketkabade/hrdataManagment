package com.CURD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.CURD")
public class HrManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrManagementSystemApplication.class, args);
	}

}
