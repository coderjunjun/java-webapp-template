package cn.junwork.webapp.web.controller.page;

import javax.servlet.http.HttpServletRequest;
import cn.junwork.webapp.web.controller.AbstractController;

/**
 * 页面控制器，返回HTML资源文件
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
public abstract class BasePageController extends AbstractController {

    @Override
    public Object handleException(HttpServletRequest request, Throwable e) {
        return null;
    }
}
