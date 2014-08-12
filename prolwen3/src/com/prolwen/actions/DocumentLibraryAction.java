package com.prolwen.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.files.ProlwenFile;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.prolwen.beans.LibraryBean;

@SuppressWarnings("serial")
public class DocumentLibraryAction extends ActionSupport {
	
	ProlwenFile pf;
	/* 
	 * VEEW LIBRARY
	 */
	@Override
	public String execute() {
		String path = "C:\\Users\\Juger\\Downloads";
		pf = new ProlwenFile(path);
		return SUCCESS;
	}

	

	public ProlwenFile getProlwenFile() {
		return pf;
	}
	public void setProlwenFile(ProlwenFile pf){
		this.pf = pf;
	}

}
