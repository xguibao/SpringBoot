package com.xugb.controller;

import com.xugb.Entity.RedisEntity;
import com.xugb.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/17
 * Time：22:56
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<RedisEntity> list()
    {
        return redisService.list();
    }
}
