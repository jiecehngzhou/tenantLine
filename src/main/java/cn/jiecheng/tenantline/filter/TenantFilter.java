package cn.jiecheng.tenantline.filter;

import cn.jiecheng.tenantline.util.TenantContext;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Order(1)
public class TenantFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        TenantContext.setCurrentTenant(getHeaderOrParam(servletRequest));
        filterChain.doFilter(servletRequest, servletResponse);
        TenantContext.clear();
    }

    private String getHeaderOrParam(ServletRequest request) {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        return httpRequest.getHeader("tenantId");
    }
}