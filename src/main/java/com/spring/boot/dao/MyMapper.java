package com.spring.boot.dao;

import com.spring.boot.dao.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * dao层接口类
 *
 * @author 代码的路
 * @date 2022/6/10
 */

@Mapper
public interface MyMapper {

    UserDTO LearnMapper(int number);

}
