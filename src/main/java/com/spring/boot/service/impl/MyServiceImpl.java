package com.spring.boot.service.impl;

import com.spring.boot.dao.MyMapper;
import com.spring.boot.dao.model.UserDTO;
import com.spring.boot.service.MyService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;


/**
 * Service层
 *
 * @author 代码的路
 * @date 2022/6/8
 */

@Service
@EnableScheduling
public class MyServiceImpl implements MyService {

    @Resource
    MyMapper myMapper;

    public String learnService(int number){

        UserDTO res = myMapper.LearnMapper(number);
        String name = res.getName();
        System.out.println("name:" + name + "\n");
        return name;

    }


    @Scheduled(cron = "1/10 * * * * ? ")  //10s一次
    public void learnCron(){

        Long timeLong = System.currentTimeMillis();
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置格式
        String timeString = timeFormat.format(timeLong);
//        System.out.println("timeString:" + timeString + "\n");
    }
}
