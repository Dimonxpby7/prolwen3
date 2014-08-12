package com.prolwen.beans;

import java.util.List;

public class LibraryBean {
	private String value;
	private List<String> path;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<String> getPath() {
		return path;
	}

	public void setPath(List<String> path) {
		this.path = path;
	}
}
