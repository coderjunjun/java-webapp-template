package cn.junwork.webapp.service.biz.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import cn.junwork.webapp.service.biz.DemoService;
import cn.junwork.webapp.service.model.BizData;
import lombok.extern.slf4j.Slf4j;

/**
 * @author coderjunjun@gmail.com
 * @date 2020/8/9
 */
@Service
@Slf4j
public class DemoServiceImpl implements DemoService, InitializingBean {

    @PostConstruct
    public void init() {
        log.info("PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet");
    }

    @Override
    public BizData getBizData() {
        BizData data = new BizData();
        data.setId(111);
        data.setContent("pp");
        throw new RuntimeException("fdfdsfre");
    }
}
