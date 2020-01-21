package com.zydgbbs.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zydgbbs.order.service.OrderMemberService;
import com.zydgbbs.order.service.OrderMemberService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderMemberService orderMemberService;
    @Autowired
    private OrderMemberService1 orderMemberService1;

    @RequestMapping(value = "/getOrderUserAll", produces = { "application/json;charset=UTF-8" })
    public List<String> getOrderUserAll(){
        System.out.println("订单服务正在调用会员服务");
        return orderMemberService.getOrderUserAll();
    }

    @RequestMapping(value = "/getOrderUserAll1", produces = { "application/json;charset=UTF-8" })
    public List<String> getOrderUserAll1(){
        System.out.println("订单服务正在通过feign调用会员服务");
        return orderMemberService1.getOrderUserAll();
    }

    //模拟雪崩访问
    @RequestMapping("/get")
    public String getResult(){
        return "雪崩...";
    }

}
