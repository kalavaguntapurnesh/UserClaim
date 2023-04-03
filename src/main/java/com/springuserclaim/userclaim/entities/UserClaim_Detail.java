package com.springuserclaim.userclaim.entities;

public class UserClaim_Detail {
	
	private long id;
	private long UserId;
	private String claimType;
	private String claimValue;
	public UserClaim_Detail(long id, long userId, String claimType, String claimValue) {
		super();
		this.id = id;
		UserId = userId;
		this.claimType = claimType;
		this.claimValue = claimValue;
	}
	public UserClaim_Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long userId) {
		UserId = userId;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getClaimValue() {
		return claimValue;
	}
	public void setClaimValue(String claimValue) {
		this.claimValue = claimValue;
	}
	@Override
	public String toString() {
		return "UserClaim_Detail [id=" + id + ", UserId=" + UserId + ", claimType=" + claimType + ", claimValue="
				+ claimValue + "]";
	}
	
	
	
	

}
