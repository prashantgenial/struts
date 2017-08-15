package com.mkyong.common.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mkyong.common.form.HelloWorldForm;

public class HelloWorldAction extends Action{

	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
        throws Exception {

		if(isCancelled(request)){
			System.out.println("Request cancelled...");
			return mapping.findForward("main");
		}
		
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		//helloWorldForm.setMessage("Hello World! Struts");
		System.out.println("Inside hello world Action"+helloWorldForm.getMode());
		if("Save Me Please!".equals(helloWorldForm.getMode())){
			request.setAttribute("HelloWorldForm",helloWorldForm);
			return mapping.findForward("success");
		}
		return mapping.getInputForward();
	}

}