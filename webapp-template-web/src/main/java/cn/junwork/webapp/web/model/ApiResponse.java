package cn.junwork.webapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * API请求返回模型
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
public class ApiResponse<T> {

    /**
     * 返回码
     */
    @Getter
    private int code;

    /**
     * 结果描述
     */
    @Getter
    @Setter
    private String message;

    /**
     * 数据
     */
    @Getter
    @Setter
    private T data;

    public ApiResponse(CodeEnum codeEnum, String message, T data) {
        this.code = codeEnum.code;
        this.message = message != null ? message : codeEnum.desc;
        this.data = data;
    }

    public static <T> ApiResponse<T> newSuccess() {
        return newSuccess(null);
    }

    public static <T> ApiResponse<T> newSuccess(T data) {
        return new ApiResponse<>(CodeEnum.SUCCESS, null, data);
    }

    public static ApiResponse<Void> newFailed(String message) {
        return new ApiResponse<>(CodeEnum.FAILED, message, null);
    }

    public static ApiResponse<Void> newSystemError() {
        return new ApiResponse<>(CodeEnum.SYSTEM_ERROR, null, null);
    }

    @AllArgsConstructor
    public enum CodeEnum {
        /**
         * 成功
         */
        SUCCESS(0, "成功"),
        /**
         * 需要登录
         */
        LOGIN_REQUIRED(-1, "需要登录"),
        /**
         * 参数不合法
         */
        PARAM_ILLEGAL(-2, "参数不合法"),
        /**
         * 操作失败，即已知的错误，会给用户返回明确的错误信息
         */
        FAILED(-3, "操作失败"),
        /**
         * 服务器内部错误，通常就是发生了未知异常
         */
        SYSTEM_ERROR(-4, "服务器内部错误")
        ;

        private final int code;
        private final String desc;
    }
}
