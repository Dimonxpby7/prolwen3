package com.prolwen.beans;


public class FileBean {
	private String path;
	private String name;
	private String length;
	private String description;
	
	public FileBean(String name, String path,String length, String description){
		setName(name);
		setPath(path);
		setLength(length);
		setDescription(description);
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
