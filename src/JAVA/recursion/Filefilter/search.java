package JAVA.recursion.Filefilter;

import java.io.File;

public class search {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\Desktop\\javaWeb\\tomcat9.0\\apache-tomcat-9.0.22\\webapps\\jforum");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else {
                if (f.getName().toLowerCase().startsWith("mysql-connector-java")){
                    System.out.println(f);
                }
            }
        }
    }
}
