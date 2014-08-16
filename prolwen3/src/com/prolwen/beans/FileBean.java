package com.prolwen.beans;

public class FileBean {
	private String path;
	private String canonicalPath;
	private String pathParent;
	private String fileSystem;
	private String name;
	private String size;
	private boolean isExecutable;
	private boolean isReadable;
	private boolean isWritable;
	private String lastModifiedTime;
	
	public String getCanonicalPath() {
		return canonicalPath;
	}

	public void setCanonicalPath(String canonicalPath) {
		this.canonicalPath = canonicalPath;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathParent() {
		return pathParent;
	}

	public void setPathParent(String pathParent) {
		this.pathParent = pathParent;
	}

	public String getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isExecutable() {
		return isExecutable;
	}

	public void setExecutable(boolean isExecutable) {
		this.isExecutable = isExecutable;
	}

	public boolean isReadable() {
		return isReadable;
	}

	public void setReadable(boolean isReadable) {
		this.isReadable = isReadable;
	}

	public boolean isWritable() {
		return isWritable;
	}

	public void setWritable(boolean isWritable) {
		this.isWritable = isWritable;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	private FileBean(Builder builder) {
		lastModifiedTime = builder.lastModifiedTime;
		isWritable = builder.isWritable;
		isReadable = builder.isReadable;
		isExecutable = builder.isExecutable;
		size = builder.size;
		name = builder.name;
		fileSystem = builder.fileSystem;
		pathParent = builder.pathParent;
		path = builder.path;
		canonicalPath = builder.canonicalPath;
	}

	public static class Builder {
		private String path;
		private String canonicalPath;
		private String pathParent;
		private String fileSystem;
		private String name;
		private String size;
		private boolean isExecutable;
		private boolean isReadable;
		private boolean isWritable;
		private String lastModifiedTime;

		public Builder(String name, String path) {
			this.path = path;
			this.name = name;
		}

		public Builder size(String value) {
			this.size = value;
			return this;
		}

		public Builder canonicalPath(String value) {
			this.canonicalPath = value;
			return this;
		}
		
		public Builder pathParent(String value) {
			this.pathParent = value;
			return this;
		}

		public Builder fileSystem(String value) {
			this.fileSystem = value;
			return this;
		}

		public Builder isExecutable(boolean value) {
			this.isExecutable = value;
			return this;
		}

		public Builder isReadable(boolean value) {
			this.isReadable = value;
			return this;
		}

		public Builder isWritable(boolean value) {
			this.isWritable = value;
			return this;
		}

		public FileBean build() {
			return new FileBean(this);
		}

		public Builder lastModifiedTime(String value) {
			this.lastModifiedTime = value;
			return this;
		}
	}

	@Override
	public String toString() {
		StringBuilder description = new StringBuilder();
		description.append("Name=").append(name).append("\n");
		description.append("Path=").append(canonicalPath).append("\n");
		description.append("Parent=").append(pathParent).append("\n");
		description.append("FileSystem=").append(fileSystem).append("\n");
		description.append("Size=").append(size).append("\n");
		description.append("isExecutable=").append(isExecutable).append("\n");
		description.append("isReadable=").append(isReadable).append("\n");
		description.append("isWritable=").append(isWritable).append("\n");
		description.append("LastModifiedTime=").append(lastModifiedTime).append("\n");
		return description.toString();
	}
	
}
