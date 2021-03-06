package com.entity;

import java.io.Serializable;

public class Product implements Serializable{

	private String productid;
	private String productname;
	private double unitcost;
	private String status;
	private double listprice;
	private String attr1;
	private String itemid;
	
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(double unitcost) {
		this.unitcost = unitcost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getListprice() {
		return listprice;
	}
	public void setListprice(double listprice) {
		this.listprice = listprice;
	}
	public String getAttr1() {
		return attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	
	public Product() {
		
	}
	
	public Product(String productid, String productname, double unitcost,
			String status, double listprice, String attr1, String itemid) {
		
		this.productid = productid;
		this.productname = productname;
		this.unitcost = unitcost;
		this.status = status;
		this.listprice = listprice;
		this.attr1 = attr1;
		this.itemid = itemid;
	}
	
}
