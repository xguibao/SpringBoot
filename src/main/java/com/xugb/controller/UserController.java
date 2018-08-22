package com.xugb.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.xugb.common.bean.Rest;
import com.xugb.entity.TUser;
import com.xugb.entity.UserEntity;
import com.xugb.entity.ext.TablePage;
import com.xugb.jpa.UserJPA;
import com.xugb.service.IUserService;
import com.xugb.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;


    @Autowired
    private IUserService userService;

    @Autowired
    PageUtil pageUtil;


    @RequestMapping(value = "/list")
    @ResponseBody
    public Rest getUserForPaging(@RequestParam(required = false) String username,
                                 @RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @RequestParam(value = "limit", defaultValue = "10") Integer size) {
        PageInfo pageInfo = userService.getUserForPaging(username, page, size);

        return Rest.okCountData(pageInfo.getTotal(), pageInfo.getList());


    }

    @RequestMapping(value = "/add")
    public String add() {

        return "news/newsAdd";
    }

    @RequestMapping(value = "/save")
    public String save(TUser tUser) {
        userService.save(tUser);
        return "redirect:/page/news/newsList";
    }

    @RequestMapping(value = "/edit")
    public String edit(Integer id, Model model) {
        TUser tUser =userService.getById(id);
        model.addAttribute("tUser",tUser);
        return "news/newsEdit";
    }

    @RequestMapping(value = "/update")
    public String update(TUser tUser) {
        userService.update(tUser);
        return "news/newsList";
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(Integer id) {
        userService.delete(id);
        return "news/newsList";
    }




    @RequestMapping(value = "/getById")
    @ResponseBody
    public TUser getById(int id) {
       TUser tUser =userService.getById(id);
        return tUser;
    }

}
