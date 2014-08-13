package com.prolwen.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.prolwen.beans.FileBean;
import com.prolwen.beans.LibraryBean;

@SuppressWarnings("serial")
public class DocumentLibraryAction extends ActionSupport implements ModelDriven<LibraryBean> {
	
	private LibraryBean libraryBean = new LibraryBean();
	
	/* 
	 * VEEW LIBRARY
	 */
	@Override
	public String execute() {
		Map<String, List<FileBean>> library = getMaxMethod();
		getModel().setFilesPDF(library.get("pdf"));
		getModel().setFilesPDF(library.get("djvu"));
		getModel().setFilesPDF(library.get("xml"));
		return SUCCESS;
	}

	private Map<String, List<FileBean>> getMaxMethod() {
		Map<String, List<FileBean>> library = new HashMap<String, List<FileBean>>();
		
		List<FileBean> filesPDF = new ArrayList<FileBean>();
		for (int i = 0; i < 5; i++) {
			filesPDF.add(new FileBean("pdf" + i, "file" + i));
		}
		
		List<FileBean> filesDJVU = new ArrayList<FileBean>();
		for (int i = 0; i < 5; i++) {
			filesDJVU.add(new FileBean("djvu" + i, "file" + i));
		}
				
		library.put("PDF", filesDJVU);
		
		List<FileBean> filesXML = new ArrayList<FileBean>();
		for (int i = 0; i < 5; i++) {
			filesDJVU.add(new FileBean("xml" + i, "file" + i));
		}
		library.put("PDF", filesXML);
		
		return library;
	}

	@Override
	public LibraryBean getModel() {
		return libraryBean;
	}

}
