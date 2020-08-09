package cn.junwork.webapp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AppLauncher {

	public static void main(String[] args) {
		log.info("开始启动...");
		SpringApplication.run(AppLauncher.class, args);
	}

}
