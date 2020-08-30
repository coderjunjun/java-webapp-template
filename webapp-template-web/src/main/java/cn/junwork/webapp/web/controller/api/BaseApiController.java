package cn.junwork.webapp.web.controller.api;

import javax.servlet.http.HttpServletRequest;

import cn.junwork.webapp.web.controller.AbstractController;
import cn.junwork.webapp.web.model.ApiResponse;

/**
 * API控制器，返回JSON格式数据
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
public abstract class BaseApiController extends AbstractController {

    @Override
    public Object handleException(HttpServletRequest request, Throwable e) {
        webLog.error("API请求异常, url = {}", request.getRequestURI(), e);
        return ApiResponse.newSystemError();
    }
}
