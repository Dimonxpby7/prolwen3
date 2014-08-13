package com.prolwen.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.prolwen.beans.FileBean;
import com.prolwen.beans.LibraryBean;

@SuppressWarnings("serial")
public class DocumentLibraryAction extends ActionSupport implements
		ModelDriven<LibraryBean> {

	private LibraryBean libraryBean = new LibraryBean();

	/*
	 * VEEW LIBRARY
	 */
	@Override
	public String execute() {
		
		getModel().setFilesPDF(getLibrary(new File[5])); //массив File уже состоит только из пдф
		getModel().setFilesDJVU(getLibrary(new File[5])); //массив File уже состоит только из djvu
		getModel().setFilesXML(getLibrary(new File[5]));  //массив File уже состоит только из xml
		return SUCCESS;
	}

	public static List<FileBean> getLibrary(File[] files) {
		List<FileBean> collection = new ArrayList<FileBean>();
		for (File file : files) {
			collection.add(new FileBean(file.getName(),file.getPath()));
		}
		return collection;
	}
	
	@Override
	public LibraryBean getModel() {
		return libraryBean;
	}

}
