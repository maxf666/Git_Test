package com.zgxcw.demo.spring;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/**
 * Created by lsjf on 2016/9/13.
 */
public class UserConfigListener extends ContextLoaderListener {
    public void contextInitialized(ServletContextEvent event) {
        try {
            //Config.getInstance().init();
        } catch (Exception e) {
           //logger.error("初始化信息错误：", e);
        }
    }

}
