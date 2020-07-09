package JAVA.File;

import java.io.File;
import java.io.IOException;

public class Filenumber {
    public static void main(String[] args) throws IOException {


        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\0801").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\0902").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\0903").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\1001").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\1002").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\1003").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\1004").listFiles().length);
        System.out.println(new File("E:\\qq下载的文件\\前端\\8\\1005").listFiles().length);
                //if (!f1.exists()) {
        //    System.out.println("file wrong");
        //} else {


            /*for (File f : f1.listFiles()) {
                System.out.println(f.getName());
            }*/
       // }
    }
}