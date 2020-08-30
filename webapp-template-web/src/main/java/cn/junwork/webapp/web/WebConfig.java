package cn.junwork.webapp.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mvc配置
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * API请求路径统一前缀
     */
    private static final String API_PATH_PREFIX = "/api";

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix(API_PATH_PREFIX, HandlerTypePredicate.forAnnotation(RestController.class));
    }
}