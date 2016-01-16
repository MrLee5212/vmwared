package com.utron.yw.model;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;

    private Integer userType;

    private String name;

    private String mobile;

    private String email;

    private String password;

    private String photoUrl;

    private Date registerTime;

    private Byte sex;

    private Integer orgId;

    private String account;

    private String salt;

    private Integer flag;

    private boolean RememberMe;
    
    private int selectedMainMemu;
    
    private int selectedChildMenu;
    
    private List<ResourceConfig> childMenuList;
    
    public int getSelectedMainMemu() {
		return selectedMainMemu;
	}

	public void setSelectedMainMemu(int selectedMainMemu) {
		this.selectedMainMemu = selectedMainMemu;
	}

	public int getSelectedChildMenu() {
		return selectedChildMenu;
	}

	public void setSelectedChildMenu(int selectedChildMenu) {
		this.selectedChildMenu = selectedChildMenu;
	}

	public List<ResourceConfig> getChildMenuList() {
		return childMenuList;
	}

	public void setChildMenuList(List<ResourceConfig> childMenuList) {
		this.childMenuList = childMenuList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

	public boolean isRememberMe() {
		return RememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		RememberMe = rememberMe;
	}
}