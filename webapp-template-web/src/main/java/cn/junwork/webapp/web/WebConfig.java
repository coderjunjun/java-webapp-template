package cn.junwork.webapp.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
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
    public static final String API_PATH_PREFIX = "/api";

    /**
     * 静态资源根目录
     */
    private static final String STATIC_RESOURCE_HOME = "classpath:webclient/";

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        // rest API映射统一加上 "/api" 的前缀
        configurer.addPathPrefix(API_PATH_PREFIX, HandlerTypePredicate.forAnnotation(RestController.class));
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 静态资源handler优先级设置为最高
        registry.setOrder(-1);
        registry.addResourceHandler("*.*").addResourceLocations(STATIC_RESOURCE_HOME);
        registry.addResourceHandler("/static/**").addResourceLocations(STATIC_RESOURCE_HOME + "static/");
    }
}