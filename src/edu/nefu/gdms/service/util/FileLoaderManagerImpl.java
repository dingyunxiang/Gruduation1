package edu.nefu.gdms.service.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class FileLoaderManagerImpl {
	
	public static String saveFile(File file,String filename ,String path) throws IOException{
        String path1 = path + "/1";
        System.out.println("path1"+path1);
        File dire = new File(path1);
        CreateDire.createFile(dire);
		String realpath = path;
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
