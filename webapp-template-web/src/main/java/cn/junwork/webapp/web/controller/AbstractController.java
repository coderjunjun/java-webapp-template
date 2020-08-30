package cn.junwork.webapp.web.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * 控制器抽象类，定义一些通用的方法
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Slf4j(topic = "web.log")
public abstract class AbstractController {

    protected static final Logger webLog = log;

    @ExceptionHandler(Throwable.class)
    public abstract Object handleException(HttpServletRequest request, Throwable e);
}
