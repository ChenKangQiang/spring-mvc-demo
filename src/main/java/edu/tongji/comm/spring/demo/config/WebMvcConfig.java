package edu.tongji.comm.spring.demo.config;

import edu.tongji.comm.spring.demo.interceptor.TestInterceptor1;
import edu.tongji.comm.spring.demo.interceptor.TestInterceptor2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description:
 * @Author: chenkangqiang
 * @Date: 2020/8/25
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 如果拦截器中使用了依赖注入，那么需要将该拦截器交给Spring容器管理
     *
     * @return
     */
    @Bean
    public HandlerInterceptor getTestInterceptor1() {
        return new TestInterceptor1();
    }

    /**
     * 添加拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(new TestInterceptor1())
                .addPathPatterns("/**")
                .excludePathPatterns("/hello");

//        registry.addInterceptor(getTestInterceptor1())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/hello");

        registry.addInterceptor(new TestInterceptor2())
                .addPathPatterns("/**")
                .excludePathPatterns("/hello");

        super.addInterceptors(registry);
    }
}
