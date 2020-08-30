package cn.junwork.webapp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
        scanBasePackages = "cn.junwork.webapp",
        exclude = DataSourceAutoConfiguration.class
)
public class AppLauncher {

    public static void main(String[] args) {
        SpringApplication.run(AppLauncher.class, args);
    }

}
