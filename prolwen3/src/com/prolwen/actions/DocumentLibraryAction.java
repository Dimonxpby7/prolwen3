package com.prolwen.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.prolwen.Utils.FileManager;
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
		FileManager fm = FileManager.getInstance();
		getModel().setFilesJPG(buildFileBeans(fm.getFilesAsMap(context.getRealPath(path), path, FileManager.Format.ALL)));
		 return SUCCESS;
	}

	public  List<FileBean> buildFileBeans(Map<String,File> map) {
		List<FileBean> collection = new ArrayList<FileBean>();
		Set<String> set  = map.keySet();
		for (String canonicalPath : set) {
			File file = map.get(canonicalPath);
					
			collection.add(new FileBean(file.getName(),canonicalPath,calculateSize(file.length()),"THIS INFO"));
		}
		
		return collection;
	}

	public String calculateSize(long length){
		double size  = length/1024;
		return String.valueOf(size) + " KB";
	}

	@Override
	public LibraryBean getModel() {
		return libraryBean;
	}

}
