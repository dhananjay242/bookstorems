package com.bookstore.myeurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest; 

@Component
public class MyLogFilter extends ZuulFilter {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object run() throws ZuulException {
		logger.info("---1. MyLogFilter---run()");
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String URI = request.getRequestURI();
		logger.info(" Request From => " + URI);
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}
}