package com.xugb.mailtest;

import com.xugb.core.MailSender;
import com.xugb.enums.MailContentTypeEnum;

import java.util.ArrayList;

public class TestMail {

    public static void main(String[] args) throws Exception
    {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("guibao.xu@enzenith.com");
                }})
                .send();
    }
}
