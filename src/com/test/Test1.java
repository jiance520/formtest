package com.test;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Map<String,Object> mp = new HashMap<String, Object>();
		mp.put("url", "/test/index.jsp");
		mp.put("price", 10);
		mp.put("check", true);
		

		String js = JSON.toJSONString(mp);
		
		System.out.println(" json = "+js);
	}

}
