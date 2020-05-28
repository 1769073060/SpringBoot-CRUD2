package com.rzk.mapper;

import com.rzk.pojo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User selectPasswordByName(@Param("userName") String userName, @Param("password") String password);
}
