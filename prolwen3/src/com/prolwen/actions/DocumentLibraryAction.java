package com.prolwen.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.prolwen.Utils.ProlwenSearcher;
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
		String path = "/library/";
		ServletContext context = ServletActionContext.getServletContext();
		String realPath = context.getRealPath(path);
		List<File> jpgFiles = ProlwenSearcher.getInstance(realPath, ProlwenSearcher.Format.JPG).getFilesAsList();
		
		getModel().setFilesJPG(buildFileBeans(jpgFiles));
		 return SUCCESS;
	}

	public static List<FileBean> buildFileBeans(List<File> files) {
		List<FileBean> collection = new ArrayList<FileBean>();
		for (File file : files) {
			collection.add(new FileBean(file.getName(), file.getPath()));
		}
		return collection;
	}


	@Override
	public LibraryBean getModel() {
		return libraryBean;
	}

}
