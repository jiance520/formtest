package com.test;

import com.alibaba.fastjson.JSON;
import com.entity.*;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		TreeData td = new TreeData();
		         td.setId(1);
		         td.setText("Folder1");
		         td.setState("open");
		         td.setChecked(false);
		         td.setIconCls("icon-remove");
		         
		        Map<String,Object> mp = new HashMap<String, Object>();
		 		mp.put("url", "/test/index.jsp");
		 		mp.put("price", 10);
		 		
		 		td.setAttributes(mp);
		
		String js = JSON.toJSONString(td);
		
		
		System.out.println(" json = "+js);
	}

}
