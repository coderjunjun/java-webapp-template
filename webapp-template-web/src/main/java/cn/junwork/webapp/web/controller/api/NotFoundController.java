package cn.junwork.webapp.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

import cn.junwork.webapp.web.model.ApiResponse;

/**
 * HandlerMapping 会优先选择直接匹配（不带通配符）的映射，如果没有，
 * 再从通配中选择匹配度最高的，所以我们可以直接用 /** 来兜那些没有直接
 * 匹配的URL。
 *
 * @author coderjunjun@gmail.com
 * @date 2020/9/12
 */
@RestController
public class NotFoundController {

    @RequestMapping("/**")
    public ApiResponse<Void> apiNotFound(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return ApiResponse.newFailed("API not found.");
    }
}
