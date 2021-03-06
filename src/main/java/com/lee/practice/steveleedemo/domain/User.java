package com.lee.practice.steveleedemo.domain;

public class User {

    private String mail_id;
    private String pw;
    private String use_yn;
    private String phone_num;
    private String type;
    private String addr;
    private String sn7;

    public User(String mail_id, String pw, String use_yn, String phone_num, String type, String addr, String sn7) {
        this.mail_id = mail_id;
        this.pw = pw;
        this.use_yn = use_yn;
        this.phone_num = phone_num;
        this.type = type;
        this.addr = addr;
        this.sn7 = sn7;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUse_yn() {
        return use_yn;
    }

    public void setUse_yn(String use_yn) {
        this.use_yn = use_yn;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSn7() {
        return sn7;
    }

    public void setSn7(String sn7) {
        this.sn7 = sn7;
    }

    @Override
    public String toString() {
        return "User{" +
                "mail_id='" + mail_id + '\'' +
                ", pw='" + pw + '\'' +
                ", use_yn='" + use_yn + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", type='" + type + '\'' +
                ", addr='" + addr + '\'' +
                ", sn7='" + sn7 + '\'' +
                '}';
    }
}
