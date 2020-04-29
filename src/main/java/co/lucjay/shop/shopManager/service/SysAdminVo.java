package co.lucjay.shop.shopManager.service;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("sysAdminVo")
public class SysAdminVo {
	private int sNum;
	private String mRegister;
	private String mAuthority;
	private int Memployeenum;
	private Date startDate;
	private Date endDate;

	private Date sysUpdate;
	private String updateType;

	public SysAdminVo() {
		// TODO Auto-generated constructor stub
	}

	public int getsNum() {
		return sNum;
	}

	public String getmRegister() {
		return mRegister;
	}

	public String getmAuthority() {
		return mAuthority;
	}

	public int getMemployeenum() {
		return Memployeenum;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public void setmRegister(String mRegister) {
		this.mRegister = mRegister;
	}

	public void setmAuthority(String mAuthority) {
		this.mAuthority = mAuthority;
	}

	public void setMemployeenum(int memployeenum) {
		Memployeenum = memployeenum;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getSysUpdate() {
		return sysUpdate;
	}

	public void setSysUpdate(Date sysUpdate) {
		this.sysUpdate = sysUpdate;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

}
