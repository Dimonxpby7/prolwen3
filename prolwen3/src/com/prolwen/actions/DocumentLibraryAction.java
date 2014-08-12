package com.prolwen.actions;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DocumentLibraryAction extends ActionSupport {
	
	private String value;
	
	@Override
	public String execute() {
		setValue("olala");
		return "success";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
