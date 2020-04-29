package co.lucjay.shop.shopManager.service;

import org.springframework.stereotype.Component;

@Component("companyMasterVo")
public class CompanyMasterVo {

	private String mRegister;
	private String madminId;
	private String mName;
	private String mCeo;
	private String mBusinessType;
	private String mBusinessCategory;
	private String mAddress;
	private String mTel;
	private String mMobile;
	private String mEmail;
	private String mAdminPasword;
	private String mAuthority;
	private int mEmployeeNum;

	public CompanyMasterVo() {
		// TODO Auto-generated constructor stub
	}

	public String getmRegister() {
		return mRegister;
	}

	public String getMadminId() {
		return madminId;
	}

	public String getmName() {
		return mName;
	}

	public String getmCeo() {
		return mCeo;
	}

	public String getmBusinessType() {
		return mBusinessType;
	}

	public String getmBusinessCategory() {
		return mBusinessCategory;
	}

	public String getmAddress() {
		return mAddress;
	}

	public String getmTel() {
		return mTel;
	}

	public String getmMobile() {
		return mMobile;
	}

	public String getmEmail() {
		return mEmail;
	}

	public String getmAdminPasword() {
		return mAdminPasword;
	}

	public String getmAuthority() {
		return mAuthority;
	}

	public int getmEmployeeNum() {
		return mEmployeeNum;
	}

	public void setmRegister(String mRegister) {
		this.mRegister = mRegister;
	}

	public void setMadminId(String madminId) {
		this.madminId = madminId;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setmCeo(String mCeo) {
		this.mCeo = mCeo;
	}

	public void setmBusinessType(String mBusinessType) {
		this.mBusinessType = mBusinessType;
	}

	public void setmBusinessCategory(String mBusinessCategory) {
		this.mBusinessCategory = mBusinessCategory;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public void setmTel(String mTel) {
		this.mTel = mTel;
	}

	public void setmMobile(String mMobile) {
		this.mMobile = mMobile;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public void setmAdminPasword(String mAdminPasword) {
		this.mAdminPasword = mAdminPasword;
	}

	public void setmAuthority(String mAuthority) {
		this.mAuthority = mAuthority;
	}

	public void setmEmployeeNum(int mEmployeeNum) {
		this.mEmployeeNum = mEmployeeNum;
	}

}
