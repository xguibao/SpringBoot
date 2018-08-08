package com.xugb.service;



import com.xugb.Entity.RedisEntity;
import com.xugb.jpa.RedisJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/17
 * Time：22:43
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Service
@CacheConfig(cacheNames = "user")
public class RedisService {

    @Autowired
    private RedisJPA redisJPA;

    @Cacheable
    public List<RedisEntity> list()
    {

        return redisJPA.findAll();
    }
}
