package com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.entity.*;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TreeAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public TreeAction() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();
		
		List<TreeData> plist = new ArrayList<TreeData>();
		
		for(int i=1;i<=5;i++){
			TreeData td = new TreeData();
			         td.setId(i);
			         td.setText("p"+i);
			         if(i!=1){
			           td.setState("closed");
			         }else{
			           td.setChecked(true);
			           td.setIconCls("icon-search");
			         }
			         //Map<String,Object> mp = new HashMap<String,Object>();
			         //mp.put("url","/formtest/tree/lines.jsp");
			         //td.setAttributes(mp);
			    List<TreeData> clist = new ArrayList<TreeData>();   
			    for(int j=1;j<=3;j++){
			    	TreeData cd = new TreeData();
			    	         cd.setId(j);
			    	         String url = "" ;
					         url = "<a href='/formtest/tree/lines.jsp'>"+"c"+i+"--"+j+"</a>";
					         cd.setText(url);
			    	         
			    	clist.add(cd);
			    }
			    
			    td.setChildren(clist); // 放入子节点
			    
			plist.add(td);
		}
		
		String js = JSON.toJSONString(plist);
		System.out.println(" json = "+js);
		
		out.print(js);
		
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
