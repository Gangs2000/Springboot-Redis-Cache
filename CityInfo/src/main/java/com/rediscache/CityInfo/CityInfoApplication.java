package com.rediscache.CityInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CityInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityInfoApplication.class, args);
	}

}
