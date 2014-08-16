package com.prolwen.Utils;

import java.io.File;
import java.util.Map;

public class FileManager {

	private static FileManager self = null;

	public static enum Format {
		PDF, CSV, XML, TXT, JPG, HTML, MP3,ALL;
	}

	/**
	 * @param realPath
	 * @param format
	 */
	private FileManager() {
		super();
		self = this;
	}

	public static FileManager getInstance() {
		return (self == null) ? new FileManager() : self;
	}

	public Map<String, File> getFilesAsMap(String realPath, String path, Format format) {
		Scanner scan = new Scanner.Filler(new File(realPath), path, format).scan();
		return scan.getDelegateMap();
	}
}
