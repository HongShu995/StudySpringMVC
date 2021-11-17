package com.hongshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    /**
     * 执行顺序：
     * 拦截器1111111111的MyInterceptor的preHandle()
     * 拦截器22222222的MyInterceptor的preHandle()
     * 执行了MyController中的doSome方法
     * 拦截器222222222222的MyInterceptor的postHandle()
     * 拦截器11111111111111的MyInterceptor的postHandle()
     * 拦截器2222222222222的MyInterceptor的afterCompletion()
     * 拦截器11111111111的MyInterceptor的afterCompletion()
     */
    @RequestMapping("/some.do")
    public ModelAndView doSome(String name,Integer age)
    {
        System.out.println("执行了MyController中的doSome方法");
        //处理some.do请求了。 相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

}
