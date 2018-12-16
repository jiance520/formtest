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

public class UserAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserAction() {
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

		System.out.println("---------UserAction");
		
        String pno = request.getParameter("page");
        String psize = request.getParameter("rows");
        System.out.println(" pno = "+pno);
        System.out.println(" psize = "+psize);
        
        System.out.println("---------------------");
        String sort = request.getParameter("sort");
        String order = request.getParameter("order");
        System.out.println(" sort = "+sort);
        System.out.println(" order = "+order);
        
        int no = 1;
        try {
			no = Integer.parseInt(pno);
		} catch (Exception e) {
			no = 1;
		}
        int pagesize = 3 ;
        try {
			pagesize = Integer.parseInt(psize);
		} catch (Exception e) {
			pagesize = 3 ;
		}
         
		PrintWriter out = response.getWriter();
		
		UserData  ud = new UserData();
		          ud.setTotal(10);
		
		List<Users> ulist = new ArrayList<Users>(); 
		
		if(order== null){
			order = "asc";
		}
		
		if("asc".equals(order)){
			for(int i=(no-1)*pagesize;i<no*pagesize;i++){
				Users temp = new Users(i, "tom"+i, "password"+i, Byte.valueOf("1"), "123456789123456789", "tom@236.com.cn", Long.valueOf("12312345678"));
			    ulist.add(temp);
			}
		}else{
			for(int i=no*pagesize;i>=(no-1)*pagesize;i--){
				Users temp = new Users(i, "tom"+i, "password"+i, Byte.valueOf("1"), "123456789123456789", "tom@236.com.cn", Long.valueOf("12312345678"));
			    ulist.add(temp);
			}
		}
		
		ud.setRows(ulist);
		          
		String js = JSON.toJSONString(ud);
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
