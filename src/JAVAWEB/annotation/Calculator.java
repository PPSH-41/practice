package JAVAWEB.annotation;

public class Calculator {
    @check
    public void add()
    {
        System.out.println("1+0="+(1+0));
    }
    @check
    public void sub()
    {
        System.out.println("1-0="+(1-0));
    }
    @check
    public void mul()
    {
        System.out.println("1*0="+(1*0));
    }
    @check
    public void div()
    {
        System.out.println("1/0="+(1/0));
    }
    public void show(){
        System.out.println("愿阴间永无bug......");
    }
}
