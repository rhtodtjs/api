package com.actibody.api.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DynamicUpdate
@Table(name="users")
public class Users {
    @Id
    @Column(name = "user_idx")
    private String userIdx;
    @Column(name = "row_num")
    private long rowNum;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_nickname")
    private String userNickname;
    @Column(name = "user_phone")
    private String userPhone;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_gender")
    private String userGender;
    @Column(name = "user_lang")
    private String userLang;
    @Column(name = "is_deleted")
    private boolean isDeleted;
    @Column(name = "is_blocked")
    private boolean isBlocked;
    @Column(name = "is_nickname")
    private boolean isNickname;
    @Column(name = "enable")
    private Boolean enable;
    @Column(name = "reg_date",updatable = false,insertable = false)
    private Timestamp regDate;
    @Column(name = "udt_date",updatable = false,insertable = false)
    private Timestamp udtDate;

    public String getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(String userIdx) {
        this.userIdx = userIdx;
    }

    public long getRowNum() {
        return rowNum;
    }

    public void setRowNum(long rowNum) {
        this.rowNum = rowNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserLang() {
        return userLang;
    }

    public void setUserLang(String userLang) {
        this.userLang = userLang;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean isNickname() {
        return isNickname;
    }

    public void setNickname(boolean nickname) {
        isNickname = nickname;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    public Timestamp getUdtDate() {
        return udtDate;
    }

    public void setUdtDate(Timestamp udtDate) {
        this.udtDate = udtDate;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userIdx='" + userIdx + '\'' +
                ", rowNum=" + rowNum +
                ", userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userLang='" + userLang + '\'' +
                ", isDeleted=" + isDeleted +
                ", isBlocked=" + isBlocked +
                ", isNickname=" + isNickname +
                ", enable=" + enable +
                ", regDate=" + regDate +
                ", udtDate=" + udtDate +
                '}';
    }
}
