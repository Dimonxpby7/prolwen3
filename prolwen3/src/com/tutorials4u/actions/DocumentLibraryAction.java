package com.tutorials4u.actions;

import com.opensymphony.xwork2.ActionSupport;

public class DocumentLibraryAction extends ActionSupport {
@Override
public String execute() throws Exception {
	System.out.println("actions!!!!");
	return "success";
}
}
