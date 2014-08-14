package com.prolwen.beans;

import java.util.List;

public class LibraryBean {
	private List<FileBean> filesPDF;
	private List<FileBean> filesDJVU;
	private List<FileBean> filesXML;
	private List<FileBean> filesJPG;
	
	public List<FileBean> getFilesPDF() {
		return filesPDF;
	}
	public void setFilesPDF(List<FileBean> filesPDF) {
		this.filesPDF = filesPDF;
	}
	public List<FileBean> getFilesDJVU() {
		return filesDJVU;
	}
	public void setFilesDJVU(List<FileBean> filesDJVU) {
		this.filesDJVU = filesDJVU;
	}
	public List<FileBean> getFilesXML() {
		return filesXML;
	}
	public void setFilesXML(List<FileBean> filesXML) {
		this.filesXML = filesXML;
	}
	public List<FileBean> getFilesJPG() {
		return filesJPG;
	}
	public void setFilesJPG(List<FileBean> filesJPG) {
		this.filesJPG = filesJPG;
	}
	
}
