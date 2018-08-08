package com.xugb.jpa;

import com.xugb.Entity.RedisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/14
 * Time：23:08
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface RedisJPA extends JpaRepository<RedisEntity,Long>
{

}
