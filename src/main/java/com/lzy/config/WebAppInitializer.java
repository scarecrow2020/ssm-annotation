package com.lzy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 1、ServletContext：web容器全局上下文对象 ，它由web容器负责初始化，为后面的spring容器提供宿主环境。
 * addServlet：注册servlet，通过对应类的构造传入初始化参数
 * addListener：注册监听器，通过对应类的构造传入初始化参数
 * addFilter：注册过滤器，通过对应类的构造传入初始化参数、
 * addMapping：添加匹配路径
 * 2、AnnotationConfigWebApplicationContext ：该类为spring框架提供的配置文件注册类
 * 用于加载配置文件存储到web容器中的map集合中,以便初始化servlet、listener等web组件类时使用
 * register方法：用于注册配置类
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //加载Spring配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //配置SpringMVC
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MVCServletConfig.class};
    }

    /**
     * 路径映射
     * <servlet-mapping>
     * <servlet-name>spring-mvc</servlet-name>
     * <url-pattern>/*</url-pattern>
     * </servlet-mapping>
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
}
