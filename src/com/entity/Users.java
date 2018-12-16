package com.entity;

/*
 *    USID ���û�id ���������� INT  AUTO_INCREMENT
	  UNAME����������    VARCHAR(20) not null
	  UPWD �����룩��    VARCHAR(20) not null
	  SEX  ���Ա� 1 �� �� �� 0 �� Ů���� TINYINT  not null
	  CARD_NO�����֤���룩��  VARCHAR(20)
	  EMAIL  �����䣩��    VARCHAR(80)
	  MOBILE ���ֻ�����    BIGINT
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
