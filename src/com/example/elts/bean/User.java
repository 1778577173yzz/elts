package com.example.elts.bean;

import java.io.Serializable;

public class User implements Serializable{
/**
 * "id":1001,
 "name":"уе╥и",
 "avatar":"avatar/zhangfei.jpg",
 "password":"1234",
 "phone":"68357788",
 "email":"zhangfei@qq.com"
 */
	private int id;
	private String name;
	private String avatar;
	private String pasword;
	private String phone;
	private String email;
	
	public User(){
		
	}
	public User(int id,String name,String avatar,String pasword,String phone,String email){
		this.avatar=avatar;
		this.id=id;
		this.email=email;
		this.pasword=pasword;
		this.name=name;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", avatar=" + avatar
				+ ", pasword=" + pasword + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
}
