package com.jq.sc.ek_service_provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.jq.sc.ek_service_provider.controller
 *
 * @author WuJinquan 2019年08月21日22:21
 * @version 1.0
 */
@RestController
@RequestMapping(value = "provider")
public class DemoController {

    @RequestMapping(value = "test1")
    public Object providerTest1() {
        System.out.println("Hello World Provider Test1!");
        return "Hello World Provider Test1!";
    }
}
