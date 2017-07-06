# spring-mvc-demo

## 一些需要关注的地方

### spring-mvc中通常有两个配置文件
* spring-context.xml：用于配置spring相关的Bean
* dispatcher-servlet.xml：用于配置与dispatcherServlet相关的内容，如视图解析器、拦截器等

### 关于spring-mvc无法扫描到controller的问题
经过实测，有两种解决办法
1. 在dispatcher-servlet.xml配置controller扫描
```
<!--扫描 controller-->
<context:component-scan base-package="edu.tongji.comm.spring.demo.controller" />
```

2. 在spring-context.xml中开启mvc支持
```
<!--开启对@controller的支持，如果不开启该配置，则需在dispatcher-servlet.xml中扫描-->
<mvc:annotation-driven />
```

