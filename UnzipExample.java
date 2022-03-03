import.java.io.*;
import java.util.zip.*;

	class UnzipExample{
		static public void Unzip(File path){

		 File dest = new File ("Extract");

		FileInputStream fis = new FileInputStream(path);
		ZipInputStream zis = new ZipInputStream(fis);
		ZipEntry ze = zis.getNextEntry();
		}
	}