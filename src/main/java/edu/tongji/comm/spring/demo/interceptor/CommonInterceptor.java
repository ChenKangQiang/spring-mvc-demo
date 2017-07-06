package edu.tongji.comm.spring.demo.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chen on 2017/7/6.
 */
public class CommonInterceptor implements HandlerInterceptor {

    private static Logger logger = LogManager.getLogger(CommonInterceptor.class.getName());

    /**
     * 在请求之前拦截，返回true则进入请求Controller
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("==============执行顺序: 1、preHandle================");
        String requestUri = httpServletRequest.getRequestURI();
        String method = httpServletRequest.getMethod();
        String url = httpServletRequest.getContextPath();
        logger.info("RequestUri:"+requestUri);
        logger.info("method:"+method);
        logger.info("url:"+url);


//       String username =  (String)request.getSession().getAttribute("user");
//        if(username == null){
//            request.getRequestDispatcher("/tool/login/login.jsp").forward(request, response);
//            return false;
//        }else{return true;}

        return true;
    }

    /**
     * 在业务处理器处理请求执行完成后，在返回试图前拦截，
     * 可在modelAndView中加入数据，比如当前时间
     * @param httpServletRequest
     * @param httpServletResponse
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("==============执行顺序: 2、postHandle================");
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     * @param httpServletRequest
     * @param httpServletResponse
     * @param e
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info("==============执行顺序: 3、afterCompletion================");
    }
}
