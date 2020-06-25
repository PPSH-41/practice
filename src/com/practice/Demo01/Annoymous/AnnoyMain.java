package com.practice.Demo01.Annoymous;

/*如果接口的实现类（或者父类中的子类）只需要使用唯一的一次
* 那么这种情况下就可以省略掉该类的定义，而使用匿名内部类
* 匿名内部类格式：接口名称 对象名 = new 接口名称(){
*   覆盖重写所有对象方法
* };
* */
public class AnnoyMain {
    public static void main(String[] args) {
//        MyInterfaceImpl obj = new MyInterfaceImpl();
//        obj.method();

        MyInterFace obj = new MyInterFace() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();
    }
}
