package JAVA.recursion;

import java.io.File;

public class SearchForFile {
    public static void main(String[] args) {
        File file = new File("E:\\qq下载的文件\\前端");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else {
                //String name = f.getName();
                //变为小写
                //name = name.toLowerCase();
               // boolean b = name.endsWith(".htm");
               // if (b) {
                //    System.out.println(f);
                //}
                if (f.getName().toLowerCase().startsWith("JQuery")){
                    System.out.println(f);
                }
            }
        }
    }
}

