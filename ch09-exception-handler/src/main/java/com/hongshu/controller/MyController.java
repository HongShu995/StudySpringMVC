package com.hongshu.controller;

import com.hongshu.exception.AgeException;
import com.hongshu.exception.MyUserException;
import com.hongshu.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
    @RequestMapping("/some.do")
    public ModelAndView doSome(String name,Integer age) throws MyUserException
    {
        //处理some.do请求了。 相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        //根据请求参数抛出异常
        if(!"zs".equals(name))
        {
            throw new NameException("姓名不正确");
        }

        if(age==null || age>120)
        {
            throw new AgeException("年龄不正确");
        }
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;

    }

}
