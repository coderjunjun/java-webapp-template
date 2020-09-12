package cn.junwork.webapp.web.controller.api;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import cn.junwork.webapp.service.exception.BusinessException;
import cn.junwork.webapp.web.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * API控制器，返回JSON格式数据
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Slf4j
public abstract class BaseApiController {

    protected static final Logger webLog = log;

    @ExceptionHandler({Throwable.class})
    public Object handleException(HttpServletRequest request, Throwable e) {
        webLog.error("API请求异常, url = {}", request.getRequestURI(), e);
        return ApiResponse.newSystemError();
    }

    @ExceptionHandler({BusinessException.class})
    public Object handleException(BusinessException e) {
        return ApiResponse.newFailed(e.getMessage());
    }
}
