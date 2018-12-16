package com.entity;

/*
 *    USID （用户id ，主键）： INT  AUTO_INCREMENT
	  UNAME（姓名）：    VARCHAR(20) not null
	  UPWD （密码）：    VARCHAR(20) not null
	  SEX  （性别， 1 是 男 ， 0 是 女）： TINYINT  not null
	  CARD_NO（身份证号码）：  VARCHAR(20)
	  EMAIL  （邮箱）：    VARCHAR(80)
	  MOBILE （手机）：    BIGINT
 */
public class Users {

	  private Integer usid;
	  private String uname;
	  private String upwd;
	  private Byte sex;
	  private String cardNo;
	  private String email;
	  private Long mobile;
	  
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public Byte getSex() {
		return sex;
	}
	public void setSex(Byte sex) {
		this.sex = sex;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	public Users() {
		
	}
	public Users(Integer usid, String uname, String upwd, Byte sex,
			String cardNo, String email, Long mobile) {
		
		this.usid = usid;
		this.uname = uname;
		this.upwd = upwd;
		this.sex = sex;
		this.cardNo = cardNo;
		this.email = email;
		this.mobile = mobile;
	}
	
}
