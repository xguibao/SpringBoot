package com.xugb.service;



import com.github.pagehelper.PageInfo;
import com.xugb.entity.TUser;
import com.xugb.entity.UserEntity;
import org.springframework.data.domain.Page;

public interface IUserService {
    PageInfo getUserForPaging(String username, int pageindex, int pagenum);
    void save(TUser tUser);
    void update(TUser tUser);
    void delete(int id);




    TUser getById(int id);
}
