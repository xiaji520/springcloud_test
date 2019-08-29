package cn.xiaji.springcloud.filter;
//encoding: utf-8

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: LoginFilter.java
 */
/*

 */
@Component
public class LoginFilter extends ZuulFilter {

    //过滤器类型
    @Override
    public String filterType() {
        //前置拦截
        return "pre";
    }

    //过滤器顺序 1
    @Override
    public int filterOrder() {
        //顺序设置为1
        return 1;
    }

    //是否应该过滤
    @Override
    public boolean shouldFilter() {
        //返回true,代表过滤器生效
        return true;
    }

    //是否携带token
    @Override
    public Object run() throws ZuulException {
        //获取Zuul提供的请求上下文对象
        RequestContext currentContext = RequestContext.getCurrentContext();
        //从上下文中获取request对象
        HttpServletRequest request = currentContext.getRequest();
        //从请求中获取token
        String token = request.getHeader("token");
        System.out.println("token:" + token);

        if (null == token || StringUtils.isEmpty(token)) {
            //拦截
            currentContext.setSendZuulResponse(false);
            //设置状态码
            currentContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
        }

        return null;
    }
}