package com.prolwen.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
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
			Path path = Paths.get(file.getPath());
			
			FileTime lasTime = null;
			try {
				lasTime = Files.getLastModifiedTime(path,LinkOption.NOFOLLOW_LINKS);
			} catch (IOException e) {
				System.out.println("Not define last modified time for file.");//Logger
				e.printStackTrace();
			} 
			
			FileBean bean = new FileBean.Builder(file.getName(),canonicalPath)
												.size(calculateSize(file.length()))
												.canonicalPath(canonicalPath)
												.fileSystem(path.getFileSystem().toString())
												.pathParent(canonicalPath.substring(0,canonicalPath.indexOf(path.getFileName().toString())))
												.isExecutable(Files.isExecutable(path))
												.isReadable(Files.isReadable(path))
												.isWritable(Files.isWritable(path))
												.lastModifiedTime(String.valueOf(lasTime))
												.build();
			collection.add(bean);
		}
		
		return collection;
	}

	public String calculateSize(long length){
		if(length>=0 && length <=1048576){
		double size  = length/1024;
		return String.valueOf(size) + " KB";
	}else{
		float size = (float) length/1048576;
		return String.valueOf(size) + " MB";
		}
	}

	@Override
	public LibraryBean getModel() {
		return libraryBean;
	}

}
