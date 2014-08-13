package com.prolwen.beans;


public class FileBean {
	private String path;
	private String name;
	
	public FileBean(String name, String path){
		setName(name);
		setPath(path);
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
	
	
}
