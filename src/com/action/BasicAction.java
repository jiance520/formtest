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

public class BasicAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BasicAction() {
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
        System.out.println("---------BasicAction");
		
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
        int pagesize = 10 ;
        try {
			pagesize = Integer.parseInt(psize);
		} catch (Exception e) {
			pagesize = 10 ;
		}
         
		PrintWriter out = response.getWriter();
		
		GridData  gd = new GridData();
		          gd.setTotal(30);
		
		List<Product> plist = new ArrayList<Product>(); 
		
		if(order== null){
			order = "asc";
		}
		
		if("asc".equals(order)){
			for(int i=(no-1)*pagesize;i<no*pagesize;i++){
				Product temp = new Product("pid-"+i, "pname", 4.5, "ok", 9.0, "ok", "itid-"+i);
			    plist.add(temp);
			}
		}else{
			for(int i=no*pagesize;i>=(no-1)*pagesize;i--){
				Product temp = new Product("pid-"+i, "pname", 4.5, "ok", 9.0, "ok", "itid-"+i);
			    plist.add(temp);
			}
		}
		
		gd.setRows(plist);
		          
		String js = JSON.toJSONString(gd);
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
