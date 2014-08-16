package com.prolwen.Utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

import com.prolwen.Utils.FileManager.Format;

public class Scanner {
	// key = canonical path, value = file
	private Map<String, File> delegateMap = new HashMap<String, File>();
	private File realDir;
	private String dir;
	private Format format;

	public static class Filler {
		private File realDir;
		private String dir;
		private Format format;

		/**
		 * @param realDir
		 * @param dir
		 * @param format
		 */
		public Filler(File realDir, String dir, Format format) {
			this.realDir = realDir;
			this.dir = dir;
			this.format = format;
		}

		public Scanner scan() {
			return new Scanner(this);
		}
	}

	private Scanner(Filler filler) {
		realDir = filler.realDir;
		dir = filler.dir;
		format = filler.format;
		scanDirectory(realDir);
	}

	/**
	 * @param realDir
	 * @param format
	 */
	private void scanDirectory(File realDir) {
		if (realDir.isDirectory()) {
			File[] items = realDir.listFiles();
			for (File item : items) {
				if (item.isDirectory()) {
					File[] array = null;
					if (FileManager.Format.ALL.equals(format))
						array = item.listFiles();
					else
						array = item.listFiles(new FilenameFilter() {
							public boolean accept(File dir, String file) {
								return file.endsWith("."
										+ format.toString().toLowerCase());
							}
						});
					for (File file : array) {
						String absolutePath = file.getAbsolutePath();
						String tmp = absolutePath.substring(
								absolutePath.indexOf(dir.replace("/", "\\")),
								absolutePath.length());
						delegateMap.put(tmp.substring(1), file);
					}

				}
				// Recursive call
				if (item.isDirectory())
					scanDirectory(item);
			}
		}
	}

	public File getRealDir() {
		return realDir;
	}

	public void setRealDir(File realDir) {
		this.realDir = realDir;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public Map<String, File> getDelegateMap() {
		return delegateMap;
	}

	public void setDelegateMap(Map<String, File> delegateMap) {
		this.delegateMap = delegateMap;
	}
}
