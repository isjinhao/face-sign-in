package cn.facesignin.pojo.controller;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class AdminAct {
	
	private Integer aid;
	private String aname;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date astartTime;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date aendTime;
	private Integer num;
	private String astatus;
	private String gname;
	private String oname;
	
	
	
	public Integer getAid() {
		return aid;
	}



	public void setAid(Integer aid) {
		this.aid = aid;
	}



	public String getAname() {
		return aname;
	}



	public void setAname(String aname) {
		this.aname = aname;
	}



	public Date getAstartTime() {
		return astartTime;
	}



	public void setAstartTime(Date astartTime) {
		this.astartTime = astartTime;
	}



	public Date getAendTime() {
		return aendTime;
	}



	public void setAendTime(Date aendTime) {
		this.aendTime = aendTime;
	}



	public Integer getNum() {
		return num;
	}



	public void setNum(Integer num) {
		this.num = num;
	}



	public String getAstatus() {
		return astatus;
	}



	public void setAstatus(String astatus) {
		this.astatus = astatus;
	}



	public String getGname() {
		return gname;
	}



	public void setGname(String gname) {
		this.gname = gname;
	}



	public String getOname() {
		return oname;
	}



	public void setOname(String oname) {
		this.oname = oname;
	}



	@Override
	public String toString() {
		return "AdminAct [aid=" + aid + ", aname=" + aname + ", astartTime=" + astartTime + ", aendTime=" + aendTime
				+ ", num=" + num + ", astatus=" + astatus + ", gname=" + gname + ", oname=" + oname + "]";
	}
	
}
