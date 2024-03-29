package com.example.elts.bean;

import java.io.Serializable;

public class Question implements Serializable{
/**
 *  "title":"1.关于第一代无线通讯技术说法正确的是___",
 "optiona":"A.简称1G，1994年出现",
 "optionb":"B.模拟制式手机",
 "optionc":"C.提供区域性语音业务",
 "optiond":"D.通话效果差、保密性能不好，用户的接听范围有限",
 "answer":"BCD",
 "score":2,
 "level":1
 */
	private String title;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private String answer;
	private int score;
	private int level;
	public Question(){
		
	}
	public Question(String title,String optiona,String optionb,String optionc,
			String optiond,String answer,int score,int level){
		this.title=title;
		this.optiona=optiona;
		this.optiona=optionb;
		this.optiona=optionc;
		this.optiona=optiond;
		this.answer=answer;
		this.score=score;
		this.level=level;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOptiona() {
		return optiona;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public String getOptionb() {
		return optionb;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public String getOptionc() {
		return optionc;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public String getOptiond() {
		return optiond;
	}
	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return this.title  +"\n"
				+ this.optiona +"\n"
				+ this.optionb +"\n"
				+ this.optionc +"\n"
				+ this.optiond ;
	}
	
}
