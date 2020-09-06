package cn.junwork.webapp.service.exception;

/**
 * 业务异常，即已知的、可以明确告知用户的异常
 *
 * @author coderjunjun@gmail.com
 * @date 2020/9/6
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
