package com.xugb.controller;

import com.xugb.common.JsonData;
import com.xugb.param.Userparam;
import com.xugb.service.impl.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xugb.param.Userparam;

@Controller
@RequestMapping(value = "/sys")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveUser(Userparam userParam) {
        sysUserService.save(userParam);
        return JsonData.success();
    }

}
