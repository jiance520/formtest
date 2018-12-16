package com.entity;

import java.util.*;

/*
 *    USID （用户id ，主键）： INT  AUTO_INCREMENT
	  UNAME（姓名）：    VARCHAR(20) not null
	  UPWD （密码）：    VARCHAR(20) not null
	  SEX  （性别， 1 是 男 ， 0 是 女）： TINYINT  not null
	  CARD_NO（身份证号码）：  VARCHAR(20)
	  EMAIL  （邮箱）：    VARCHAR(80)
	  MOBILE （手机）：    BIGINT
 */
public class UserData {

    private int total;
	
	private List<Users> rows ;

	public UserData(int total, List<Users> rows) {
		
		this.total = total;
		this.rows = rows;
	}

	public UserData() {
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Users> getRows() {
		return rows;
	}

	public void setRows(List<Users> rows) {
		this.rows = rows;
	}
}
