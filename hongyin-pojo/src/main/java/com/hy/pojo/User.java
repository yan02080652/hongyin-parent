package com.hy.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表 tem_user
 */
@Entity
@Table(name = "tem_user")
public class User implements Serializable {

    @Id
    private int uid;
    private String phone;
    private String nickname;
    private Date birthday;
    private String sex;
    private String regIp;
    private Date regTime;
    private String lastLoginIp;
    private Date lastLoginTime;
    private String state;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", phone='" + phone + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", regIp='" + regIp + '\'' +
                ", regTime=" + regTime +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", state='" + state + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User() {
    }

    public User(int uid, String phone, String nickname, Date birthday, String sex, String regIp, Date regTime, String lastLoginIp, Date lastLoginTime, String state) {
        this.uid = uid;
        this.phone = phone;
        this.nickname = nickname;
        this.birthday = birthday;
        this.sex = sex;
        this.regIp = regIp;
        this.regTime = regTime;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.state = state;
    }
}
