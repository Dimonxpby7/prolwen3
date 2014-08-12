package com.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ProlwenFile {

	private File file;
	private File[] arrFile;
	
	public File[] getArrFile() {
		return arrFile;
	}

	public void setValue(File[] arrFile) {
		this.arrFile = arrFile;
	}
	
	public ProlwenFile(String path){
		file = new File(path);
		arrFile = file.listFiles();
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	



}
