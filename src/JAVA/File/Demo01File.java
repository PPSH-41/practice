package JAVA.File;

import java.io.File;


public class Demo01File {
    public static void main(String[] args) {
        show02("h:\\","b.txt");
    }

    private static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    private static void show01() {
        File f1 = new File("C:\\Users\\admin\\IdeaProjects\\practice\\a.txt");
        System.out.println(f1);//重写tostring方法

        File f2 = new File("C:\\Users\\admin\\IdeaProjects\\practice");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }
}
