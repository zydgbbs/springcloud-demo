package com.zydgbbs.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderMemberService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderUserAll(){
        return restTemplate.getForObject("http://member-service/getMemberAll",List.class);
    }

}
