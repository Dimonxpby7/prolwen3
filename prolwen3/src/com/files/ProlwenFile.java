package com.files;

import java.io.File;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class ProlwenFile {
	
	private File file = null;
	private File[] thisFile = null;
	private String path = null;
	
	public ProlwenFile(){
	}
	
	public File[] getFDList(){
		path = "WebContent" + File.separator + "library";
		file = new File(path);
		if(file.isDirectory() && file.exists())
			thisFile = file.listFiles();
		return thisFile;
		
	}
	
	

}
