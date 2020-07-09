package JAVA.File;

import java.io.File;
import java.io.IOException;

public class Demo02File {
    public static void main(String[] args) throws IOException {
        show04();
    }

    private static void show04() {
        new File("E:\\qq下载的文件\\前端\\6\\1").mkdirs();
        new File("E:\\qq下载的文件\\前端\\6\\2").mkdirs();
        new File("E:\\qq下载的文件\\前端\\7\\3").mkdirs();
        new File("E:\\qq下载的文件\\前端\\7\\4").mkdirs();
        new File("E:\\qq下载的文件\\前端\\7\\5").mkdirs();
        new File("E:\\qq下载的文件\\前端\\7\\1").mkdirs();
        new File("E:\\qq下载的文件\\前端\\7\\2").mkdirs();
        new File("E:\\qq下载的文件\\前端\\7\\6").mkdirs();
        /*File f9 = new File("E:\\qq下载的文件\\前端\\9");
        File f10 = new File("E:\\qq下载的文件\\前端\\10");
        File f11 = new File("E:\\qq下载的文件\\前端\\11");
        File f12= new File("E:\\qq下载的文件\\前端\\12");
        File f13 = new File("E:\\qq下载的文件\\前端\\13");
        File f14 = new File("E:\\qq下载的文件\\前端\\14");
        File f15 = new File("E:\\qq下载的文件\\前端\\15");
        File f16 = new File("E:\\qq下载的文件\\前端\\16");
        File f17 = new File("E:\\qq下载的文件\\前端\\17");
        File f18 = new File("E:\\qq下载的文件\\前端\\18");
        File f19 = new File("E:\\qq下载的文件\\前端\\19");
        File f20 = new File("E:\\qq下载的文件\\前端\\20");
        File f21 = new File("E:\\qq下载的文件\\前端\\21");
        File f22 = new File("E:\\qq下载的文件\\前端\\22");*/
        /*boolean b1 = f1.mkdir();
        boolean b2 = f2.mkdir();
        boolean b3 = f3.mkdir();
        boolean b4 = f4.mkdir();
        boolean b5 = f5.mkdir();
        boolean b6 = f6.mkdir();
        boolean b7 = f7.mkdir();
        boolean b8 = f8.mkdir();*/
       /* boolean b9 = f9.mkdir();
        boolean b10 = f10.mkdir();
        boolean b11 = f11.mkdir();
        boolean b12 = f12.mkdir();
        boolean b13 = f13.mkdir();
        boolean b14 = f14.mkdir();
        boolean b15 = f15.mkdir();
        boolean b16 = f16.mkdir();
        boolean b17 = f17.mkdir();
        boolean b18 = f18.mkdir();
        boolean b19 = f19.mkdir();
        boolean b20 = f20.mkdir();
        boolean b21 = f21.mkdir();
        boolean b22 = f22.mkdir();*/
    }

    private static void show03() {
        File f1 = new File("h:\\java创建文件\\1\\2");
        boolean b1 = f1.delete();
        System.out.println("b1"+b1);

        File f2 = new File("h:\\java创建文件.txt");
        boolean b2 = f2.delete();
        System.out.println("b2"+b2);
    }

    private static void show02() {
        File f1 = new File("h:\\java创建文件");
        boolean b1 = f1.mkdir();
        System.out.println("b1 "+b1);

        File f2 = new File("h:\\java创建文件\\1\\2\\3");
        boolean b2 = f2.mkdirs();
        System.out.println("b2 "+b2);

    }

    private static void show01() throws IOException, IOException {
        File f1 = new File("h:\\java创建文件.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1"+b1);

    }
}
