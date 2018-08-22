package com.xugb.mapper.mapper;

import com.xugb.entity.TUser;
import com.xugb.mapper.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TUserMapper extends MyMapper<TUser> {
    List<TUser> getUserForPaging(@Param("username")String username);

}