package cn.junwork.webapp.web.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.junwork.webapp.service.biz.DemoService;
import cn.junwork.webapp.service.model.BizData;
import cn.junwork.webapp.web.model.ApiResponse;
import cn.junwork.webapp.web.model.User;

/**
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@RestController
public class DemoApiController extends BaseApiController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/userInfo")
    public ApiResponse<User> getUserInfo() {
        User user = new User();
        user.setNickName("君");
        return ApiResponse.newSuccess(user);
    }

    @RequestMapping("/query")
    public ApiResponse<BizData> query() {
        BizData bizData = demoService.getBizData();
        return ApiResponse.newSuccess(bizData);
    }
}
