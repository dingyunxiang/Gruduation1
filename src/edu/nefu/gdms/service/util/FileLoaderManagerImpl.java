package edu.nefu.gdms.service.util;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;


public class FileLoaderManagerImpl {
	
	public String saveFile(File file,String filename ,String path) throws IOException{
		String realpath = ServletActionContext.getServletContext().getRealPath("/file");
		realpath += "/"+path;
		System.out.println("realPath"+realpath);
		if (file != null) {
            File savefile = new File(new File(realpath), filename);
            if (!savefile.getParentFile().exists())
                savefile.getParentFile().mkdirs();
            FileUtils.copyFile(file, savefile);
           return realpath+"\\"+filename;
        }
		return "fail";
	}

	
}
