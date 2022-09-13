package com.tulingxueyuan.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangChen
 * @Date 2022/9/10 16:39
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("扣减库存");
        return "扣减库存:"+port;
    }
}
