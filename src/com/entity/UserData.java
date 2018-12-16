package com.entity;

import java.util.*;

/*
 *    USID ���û�id ���������� INT  AUTO_INCREMENT
	  UNAME����������    VARCHAR(20) not null
	  UPWD �����룩��    VARCHAR(20) not null
	  SEX  ���Ա� 1 �� �� �� 0 �� Ů���� TINYINT  not null
	  CARD_NO�����֤���룩��  VARCHAR(20)
	  EMAIL  �����䣩��    VARCHAR(80)
	  MOBILE ���ֻ�����    BIGINT
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
