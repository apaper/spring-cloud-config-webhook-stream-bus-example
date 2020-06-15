package com.example.demo.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostFilter extends ZuulFilter {

	private static final Logger LOG = LoggerFactory.getLogger ( PostFilter.class );
	private static final String FILTER_TYPE = "post";


	@Override
	public boolean shouldFilter(){
		return true;
	}


	@Override
	public Object run() throws ZuulException {
		final RequestContext requestContext = RequestContext.getCurrentContext();
		final HttpServletRequest httpServletRequest = requestContext.getRequest();
		final HttpServletResponse response = requestContext.getResponse();
		LOG.info ( "Execute {}/filter for HTTP/{} request to {} with response status {} and content type {}", 
			   FILTER_TYPE, httpServletRequest.getMethod(), httpServletRequest.getRequestURL(),
			   response.getStatus(), response.getContentType());
		return null;
	}


	@Override
	public String filterType(){
		return FILTER_TYPE;
	}


	@Override
	public int filterOrder(){
		return 1;
	}

}
