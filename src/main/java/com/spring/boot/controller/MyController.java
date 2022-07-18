package com.spring.boot.controller;

import com.spring.boot.service.MyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * Controller层
 *
 * @author 代码的路
 * @date 2022/6/8
 */


@RestController
@RequestMapping("/homepage")
public class MyController {

    @Resource
    MyService myService;

    @GetMapping("/learnSpringBoot")
    public String learnController(@RequestParam("number") int number){
        return myService.learnService(number);
    }
}
