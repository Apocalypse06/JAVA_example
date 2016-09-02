package ch10._n10;

import java.io.Serializable;

class FileData implements Serializable {
	String fileName;
	long fileSize;
	public FileData(String fileName, long fileSize) {
		super();
		this.fileName = fileName;
		this.fileSize = fileSize;
	}
}