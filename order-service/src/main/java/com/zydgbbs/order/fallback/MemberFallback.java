package com.zydgbbs.order.fallback;

import com.zydgbbs.order.service.OrderMemberService1;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberFallback implements OrderMemberService1 {
    @Override
    public List<String> getOrderUserAll() {
        //服务的降级处理
        List<String> list = new ArrayList<>();
        list.add("服务发生异常...");

        return list;
    }
}
