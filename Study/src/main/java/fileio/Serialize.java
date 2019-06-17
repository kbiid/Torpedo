package fileio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Serialize {
	public static final String DIR = "D:\\test\\";
	public static final Logger invalidFileLogger = LoggerFactory.getLogger("log.invalid");

	public void setFileSawonPath();

	public void setFilePathIntern();
}
