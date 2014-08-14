package com.prolwen.Utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.LinkedList;
import java.util.List;

public class ProlwenSearcher {
	
	private static ProlwenSearcher self = null;
	
	private List<File> delegateList = new LinkedList<File>();

	public static enum Format {
		PDF, CSV, XML, TXT, JPG;
	}
	
	private ProlwenSearcher(File dir, Format format) {
		super();
		search(dir, format);
		self = this;
	}

	
	public static ProlwenSearcher getInstance(String dir, Format format) {
		return (self == null) ? new ProlwenSearcher(new File(dir), format) : self;
	}
	

	/**
	 * @param dir
	 * @param format
	 */
	private void search(File dir, final Format format) {
		if (dir.isDirectory()) {
			File[] items = dir.listFiles();
			for (File item : items) {
				if (item.isDirectory()) {
					File[] array = item.listFiles(new FilenameFilter() {
						public boolean accept(File dir, String file) {
							return file.endsWith("." + format.toString().toLowerCase());
						}
					});
					for (File file : array) {
						delegateList.add(file);
					}

				}
				// Recursive call
				if (item.isDirectory())
					search(item, format);
			}
		}
	}

	public List<File> getFilesAsList(){
		return delegateList;
	}

}
