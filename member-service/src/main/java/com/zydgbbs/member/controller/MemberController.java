package com.zydgbbs.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getMemberAll")
    public List<String> getMemberAll(){
        //做雪崩效应，模拟三秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> members = new ArrayList<>();
        members.add("张三");
        members.add("李四");
        members.add("王二");
        members.add("麻子");
        members.add(port);
        return members;
    }

}
