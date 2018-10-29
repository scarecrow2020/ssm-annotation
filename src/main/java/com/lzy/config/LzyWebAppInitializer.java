package com.lzy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LzyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //配置root上下文
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    //配置过滤器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
}
