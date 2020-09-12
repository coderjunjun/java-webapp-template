package cn.junwork.webapp.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面控制器，因为前端设计为单页应用，因此所有非API请求路径都映射到index.html。
 * 但是注意，请求要优先匹配静态资源。
 *
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Controller
public class PageController {

    private static final String INDEX_FILE = "/index.html";

    @RequestMapping("/**")
    public String home() {
        return INDEX_FILE;
    }
}
