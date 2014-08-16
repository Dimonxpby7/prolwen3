package com.prolwen.beans;


public class FileBean {
	private String path;
	private String name;
	private String length;
	
	public FileBean(String name, String path,String length){
		setName(name);
		setPath(path);
		setLength(length);
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}
	
	
}
