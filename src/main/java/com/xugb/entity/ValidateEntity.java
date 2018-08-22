package com.xugb.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/16
 * Time：16:03
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class ValidateEntity implements Serializable
{
    @NotBlank
    @Length(min = 2,max = 10)
    private String name;

    @Min(value = 1)
    private int age;

    @NotBlank
    @Email
    private String mail;

    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
