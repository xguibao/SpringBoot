package com.xugb.entity;

import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    /**
     * 编号
     */
    @Id
    @Column(name = "t_id")
    private Integer tId;

    /**
     * 名称
     */
    @Column(name = "t_name")
    private String tName;

    /**
     * 年龄
     */
    @Column(name = "t_age")
    private Integer tAge;

    /**
     * 家庭住址
     */
    @Column(name = "t_address")
    private String tAddress;

    @Column(name = "t_pwd")
    private String tPwd;

    /**
     * 获取编号
     *
     * @return t_id - 编号
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * 设置编号
     *
     * @param tId 编号
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * 获取名称
     *
     * @return t_name - 名称
     */
    public String gettName() {
        return tName;
    }

    /**
     * 设置名称
     *
     * @param tName 名称
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * 获取年龄
     *
     * @return t_age - 年龄
     */
    public Integer gettAge() {
        return tAge;
    }

    /**
     * 设置年龄
     *
     * @param tAge 年龄
     */
    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    /**
     * 获取家庭住址
     *
     * @return t_address - 家庭住址
     */
    public String gettAddress() {
        return tAddress;
    }

    /**
     * 设置家庭住址
     *
     * @param tAddress 家庭住址
     */
    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    /**
     * @return t_pwd
     */
    public String gettPwd() {
        return tPwd;
    }

    /**
     * @param tPwd
     */
    public void settPwd(String tPwd) {
        this.tPwd = tPwd;
    }
}