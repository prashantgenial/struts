package com.mkyong.common.form;

import javax.servlet.ServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class HelloWorldForm extends ActionForm{

	String message;
	boolean aggree;
	String mode;
	
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	public boolean isAggree() {
		return aggree;
	}

	public void setAggree(boolean aggree) {
		this.aggree = aggree;
	}

	public void reset(){
		
	}
	

	public ActionErrors validate(ActionMapping mapping, ServletRequest request){
		ActionErrors actionErrMsgs = new ActionErrors();
		if(this.getMessage() == null || this.getMessage().equals("")){
			actionErrMsgs.add("message",new ActionMessage("err.message"));
		}
		return actionErrMsgs;
		
	}
	
}