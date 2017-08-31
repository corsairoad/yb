package com.yunicorn.yearbook.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by fadlymunandar on 8/26/17.
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String FEATURED_IMAGE_TEMP_PATH = "/Applications/tomcat-8.5.20/temp/yearbook/featured_images";

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class, ServiceConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        final DispatcherServlet dispatcherServlet = (DispatcherServlet) super.createDispatcherServlet(servletAppContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        return dispatcherServlet;
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

        registration.setMultipartConfig(new MultipartConfigElement(FEATURED_IMAGE_TEMP_PATH, 2097152, 4194304, 0));
    }
}
