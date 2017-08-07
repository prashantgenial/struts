package com.mkyong.common.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.User;
import com.mkyong.common.form.HelloWorldForm;

public class HelloWorldAction extends Action{

	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
        throws Exception {

		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello World! Struts");
		System.out.println("Inside hello world Action");
		
		List<String> lMsg = new ArrayList<String>();
		lMsg.add("Message 1");
		lMsg.add("Message 2");
		lMsg.add("Message 3");
		lMsg.add("Message 4");
		request.setAttribute("msgs", lMsg);
		
		List<User> lUsers = new ArrayList<User>();
		lUsers.add(new User("Prashant","prashant@gmail.com"));
		lUsers.add(new User("Amit","amit@gmail.com"));
		lUsers.add(new User("Ayaansh","ayaansh@gmail.com"));
		lUsers.add(new User("Rahul","rahul@gmail.com"));
		request.setAttribute("lUsers", lUsers);
		
		return mapping.findForward("success");
	}

}