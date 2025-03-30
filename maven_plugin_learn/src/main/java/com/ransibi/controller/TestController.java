package com.ransibi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ransibi
 * @Date: 2025/03/30/23:19
 * @Description:
 */
@RestController
@RequestMapping("rsb")
public class TestController {

    @GetMapping("/user/list")
    public String test() {
        return "测试接口";
    }
}
