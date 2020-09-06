package cn.junwork.webapp.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面资源控制器
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Controller
public class PageController {

    private static final String INDEX_FILE = "/index.html";

    @RequestMapping("/home")
    public String home() {
        return INDEX_FILE;
    }
}
