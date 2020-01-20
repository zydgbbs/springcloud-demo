package com.zydgbbs.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(name = "MEMBER-SERVICE")
public interface OrderMemberService1 {

    @GetMapping(value = "/getMemberAll")
    List<String> getOrderUserAll();

}
