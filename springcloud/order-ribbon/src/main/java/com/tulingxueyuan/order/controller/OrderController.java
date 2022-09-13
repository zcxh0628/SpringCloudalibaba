package com.tulingxueyuan.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zhangChen
 * @Date 2022/9/10 16:35
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        return "Hello World"+msg;
    }
}
