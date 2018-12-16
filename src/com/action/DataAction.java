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

public class DataAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DataAction() {
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

		    System.out.println("---------DataAction");
			
	        String pno = request.getParameter("page");
	        String psize = request.getParameter("rows");
	        System.out.println(" pno = "+pno);
	        System.out.println(" psize = "+psize);
	       
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
			
			Object obj = request.getSession().getAttribute("datamap"); 
			Map<String,Object> mp = null ;
			if(obj == null){
				mp = new HashMap<String,Object>();
				for(int i=0;i<30;i++){
					Product temp = new Product("pid-"+i, "pname", 4.5, "ok", 9.0, "ok", "itid-"+i);
				    mp.put(temp.getProductid(), temp);
				}
				request.getSession().setAttribute("datamap", mp);
			}else{
				mp = (Map<String,Object>)obj;
			}
			
			List<Product> plist = new ArrayList<Product>();
			for(Object p :mp.values()){
				plist.add((Product)p);
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
