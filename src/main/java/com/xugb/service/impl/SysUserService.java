package com.xugb.service.impl;

import com.xugb.entity.SysUser;
import com.xugb.entity.ValidateEntity;
import com.xugb.exception.ParamException;
import com.xugb.mapper.mapper.SysUserMapper;
import com.xugb.param.Userparam;
import com.xugb.service.ISysUserService;
import com.xugb.utils.BeanValidator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserService implements ISysUserService {
    @Resource
    private SysUserMapper sysUserMapper;


    @Override
    public void save(Userparam param) {
        BeanValidator.check(param);
        if(checkTelephoneExist(param.getTelephone(),param.getId())){
            throw new ParamException("电话已被占用");
        }
        if(checkEmailExist(param.getMail(), param.getId())) {
            throw new ParamException("邮箱已被占用");
        }

        SysUser after = SysUser.builder().id(param.getId()).deptId(1).status(1).operator("xu").operateIp("1").username(param.getUsername()).telephone(param.getTelephone()).mail(param.getMail()).password("4444").build();
        sysUserMapper.insert(after);

    }


    public boolean checkEmailExist(String mail, Integer userId) {
        return 0 > 0;
    }

    public boolean checkTelephoneExist(String telephone, Integer userId) {
        return 0 > 0;
    }
}
