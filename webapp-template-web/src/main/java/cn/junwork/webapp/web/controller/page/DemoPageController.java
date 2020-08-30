package cn.junwork.webapp.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Controller
public class DemoPageController extends BasePageController {

    private static final String INDEX_FILE = "/index.html";

    @RequestMapping("/home")
    public String home() {
        return INDEX_FILE;
    }
}
