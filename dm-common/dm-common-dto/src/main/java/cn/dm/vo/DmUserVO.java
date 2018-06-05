package cn.dm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/***
*   用户信息
*/
public class DmUserVO implements Serializable {
    //用户ID
    private Long userId;
    //手机号
    private String phone;
    //
    private String wxUserId;
    //真实姓名
    private String realName;
    //昵称
    private String nickName;
    //性别(0:男,1:女)
    private Integer sex;
    //身份证号
    private String idCard;
    //生日
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date birthday;
    //创建时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    //更新时间
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;
    // 兴趣爱好
    private String hobby;

    // 头像图片ID
    private Long imageId;
    // 图片URL
    private String imgUrl;
/*
    // token
    private String token;
    // 有效时长
    private long extTime;
    // 当前时间
    private Date genTime;*/
    //get set 方法
    public void setUserId (Long  userId){
        this.userId=userId;
    }
    public  Long getUserId(){
        return this.userId;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setWxUserId (String  wxUserId){
        this.wxUserId=wxUserId;
    }
    public  String getWxUserId(){
        return this.wxUserId;
    }
    public void setRealName (String  realName){
        this.realName=realName;
    }
    public  String getRealName(){
        return this.realName;
    }
    public void setNickName (String  nickName){
        this.nickName=nickName;
    }
    public  String getNickName(){
        return this.nickName;
    }
    public void setSex (Integer  sex){
        this.sex=sex;
    }
    public  Integer getSex(){
        return this.sex;
    }
    public void setIdCard (String  idCard){
        this.idCard=idCard;
    }
    public  String getIdCard(){
        return this.idCard;
    }
    public void setBirthday (Date  birthday){
        this.birthday=birthday;
    }
    public  Date getBirthday(){
        return this.birthday;
    }
    public void setCreatedTime (Date  createdTime){
        this.createdTime=createdTime;
    }
    public  Date getCreatedTime(){
        return this.createdTime;
    }
    public void setUpdatedTime (Date  updatedTime){
        this.updatedTime=updatedTime;
    }
    public  Date getUpdatedTime(){
        return this.updatedTime;
    }
    public String getHobby() { return hobby; }
    public void setHobby(String hobby) { this.hobby = hobby; }

    public Long getImageId() { return imageId; }
    public void setImageId(Long imageId) { this.imageId = imageId; }
    public String getImgUrl() { return imgUrl; }
    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }
/*
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public long getExtTime() { return extTime; }
    public void setExtTime(long extTime) { this.extTime = extTime; }
    public Date getGenTime() { return genTime; }
    public void setGenTime(Date genTime) { this.genTime = genTime; }
*/

}