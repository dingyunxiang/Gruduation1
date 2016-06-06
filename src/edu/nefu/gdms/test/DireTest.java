package edu.nefu.gdms.test;

import java.io.File;
import java.io.IOException;

/**
 * Created by dingyunxiang on 16/6/6.
 */
public class DireTest {

    public static boolean createFile(File file) throws IOException {
        if(! file.exists()) {
            makeDir(file.getParentFile());
        }
        return file.createNewFile();
    }

    /**
     * Enhancement of java.io.File#mkdir()
     * Create the given directory . If the parent folders don't exists, we will create them all.
     * @see java.io.File#mkdir()
     * @param dir the directory to be created
     */
    public static void makeDir(File dir) {
        if(! dir.getParentFile().exists()) {
            makeDir(dir.getParentFile());
        }
        dir.mkdir();
    }

    public static void main(String args[]) {
        String filePath = "web/file/2016/20134269/1";
        File file = new File(filePath);
        try {
            System.out.println("file.exists()? " + file.exists());
            boolean created = createFile(file);
            System.out.println(created?"File created":"File exists, not created.");
            System.out.println("file.exists()? " + file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
