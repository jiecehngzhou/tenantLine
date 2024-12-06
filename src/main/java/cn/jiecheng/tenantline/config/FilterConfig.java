package cn.jiecheng.tenantline.config;

import cn.jiecheng.tenantline.filter.TenantFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<TenantFilter> registrationBean() {
        FilterRegistrationBean<TenantFilter> reg = new FilterRegistrationBean<>(new TenantFilter());
        reg.addUrlPatterns("/*");
        return reg;
    }
}