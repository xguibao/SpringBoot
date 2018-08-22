package com.xugb.controller;

import com.xugb.utils.RestResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {


    @RequestMapping(value = "/login")
    public String layuiLogin(HttpServletRequest request)
    {
        return "/login/login";

    }

    @ResponseBody
    @PostMapping("login/main")
    public RestResponse loginMain(HttpServletRequest request)
    {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Map<String, Object> map = new HashMap<>();
        map.put("url","index");
        if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)){
            return RestResponse.failure("用户名或者密码不能为空");
        }
        else{
            return RestResponse.success("登录成功").setData(map);

        }

    }
    /**
     *  空地址请求
     * @return
     */
    @GetMapping(value = "")
    public String noAddress() {

        return "redirect:login";
    }

    @GetMapping(value = "/index")
    public String index() {

        return "index";
    }


    @GetMapping(value = "/main")
    public String main() {

        return "main";
    }

    @GetMapping(value = "page/news/newsList")
    public String news() {

        return "news/newsList";
    }




}
