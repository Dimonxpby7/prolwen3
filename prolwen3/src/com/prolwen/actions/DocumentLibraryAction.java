package com.prolwen.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.prolwen.beans.LibraryBean;

@SuppressWarnings("serial")
public class DocumentLibraryAction extends ActionSupport implements ModelDriven<LibraryBean> {
	
	private LibraryBean libraryBean = new LibraryBean(); 
	
	/* 
	 * VEEW LIBRARY
	 */
	@Override
	public String execute() {
		List<String> collection = getListPath();
		getModel().setPath(collection);
		getModel().setValue("olala!");
		return "success";
	}

	private List<String> getListPath() {
		List<String> collection = new ArrayList<String>();
		collection.add("first");
		collection.add("second");
		return collection;
	}

	@Override
	public LibraryBean getModel() {
		return libraryBean;
	}

}
