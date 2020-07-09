package JAVA.recursion;

import java.io.File;
//显示目录下所有文件
public class Demo02 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\Desktop\\javaWeb\\tomcat9.0\\apache-tomcat-9.0.22\\webapps\\jforum");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else {
                System.out.println(f);
            }
        }


    }
}
