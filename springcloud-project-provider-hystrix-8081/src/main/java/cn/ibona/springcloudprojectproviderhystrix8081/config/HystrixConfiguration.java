package cn.ibona.springcloudprojectproviderhystrix8081.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xugongwei
 * @date 2018/11/20 9:47
 */
@Configuration
public class HystrixConfiguration {

    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet() {
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<HystrixMetricsStreamServlet> servletServletRegistrationBean = new ServletRegistrationBean<>();
        servletServletRegistrationBean.setServlet(hystrixMetricsStreamServlet);
        servletServletRegistrationBean.setEnabled(true);
        servletServletRegistrationBean.addUrlMappings("/hystrix.stream");
        servletServletRegistrationBean.setName("HystrixMetricsStreamServlet");
        return servletServletRegistrationBean;
    }
}
