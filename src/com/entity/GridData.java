package com.entity;

import java.util.*;

public class GridData {

	private int total;
	
	private List<Product> rows ;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Product> getRows() {
		return rows;
	}

	public void setRows(List<Product> rows) {
		this.rows = rows;
	}

	public GridData() {
		
	}

	public GridData(int total, List<Product> rows) {
		this.total = total;
		this.rows = rows;
	}
	
}
