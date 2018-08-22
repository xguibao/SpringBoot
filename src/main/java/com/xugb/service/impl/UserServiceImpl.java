package com.xugb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xugb.entity.TUser;
import com.xugb.mapper.mapper.TUserMapper;
import com.xugb.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl  implements IUserService {

	@Resource
	TUserMapper tUserMapper;



	@Override
	public PageInfo getUserForPaging(String username,int pageindex, int pagenum) {
		PageHelper.startPage(pageindex, pagenum);
		List<TUser> list = tUserMapper.getUserForPaging(username);
		PageInfo page = new PageInfo(list);
		return page;
	}

	@Override
	public void save(TUser tUser) {
		tUserMapper.insertSelective(tUser);
	}

	@Override
	public void update(TUser tUser) {
		tUserMapper.updateByPrimaryKey(tUser);
	}

    @Override
    public void delete(int id) {
        tUserMapper.deleteByPrimaryKey(id);
    }

    @Override
	public TUser getById(int id) {
		return tUserMapper.selectByPrimaryKey(id);
	}


}
