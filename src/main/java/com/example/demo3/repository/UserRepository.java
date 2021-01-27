package com.example.demo3.repository;

import com.example.demo3.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {

    @Select("select * from students where name=#{name}")
    UserEntity login(String name);

    @Insert("insert into students(id,name,des)value(#{id},#{name},#{des})")
    void addUser(int id,String name,String des);

    @Select("select * from students")
    UserEntity getAllUserInfo();
}
