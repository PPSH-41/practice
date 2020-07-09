package JAVA.recursion.Filefilter;

import java.io.File;
import java.io.FileFilter;

public class LambdaQuickly {
 
        public static void main(String[] args) {
            File file = new File("C:\\Users\\admin\\Desktop\\javaWeb\\tomcat9.0\\apache-tomcat-9.0.22\\webapps\\jforum");
            getAllFile(file);
        }

        private static void getAllFile(File dir) {
            //System.out.println(dir);
            File[] files = dir.listFiles(new FileFilter(){
                @Override
                public boolean accept(File pathname){
                    return pathname.isDirectory() || pathname.getName().startsWith("mysql-connection");
                }

            });//传递过滤器对象
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
                    System.out.println(f);
                }
            }
        }
    }






