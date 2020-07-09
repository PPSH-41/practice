package JAVA.File;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        //File file = new File("C:\\Users\\admin\\Desktop\\javaWeb\\tomcat9.0\\apache-tomcat-9.0.22\\webapps\\jforum");
        File file = new File("C:\\Users\\admin\\Desktop\\javaWeb\\tomcat9.0\\apache-tomcat-9.0.22\\webapps\\jforum");
        File[] arr = file.listFiles();
        for (File list :arr
             ) {
            System.out.println(list);
        }
    }

    private static void show01() {
        File file = new File("C:\\Users\\admin\\Desktop\\javaWeb\\tomcat9.0\\apache-tomcat-9.0.22\\webapps\\jforum");
        String[] arr = file.list();
        for (String filename: arr
             ) {
            System.out.println(filename);
        }

    }
}
