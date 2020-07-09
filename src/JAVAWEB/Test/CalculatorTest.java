package JAVAWEB.Test;

import JAVAWEB.JUNIT.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*初始化
    * 用于资源申请，所有测试方法执行之前都会调用此方法
    * */
    @Before
    public void init(){
        System.out.println("init....");
    }

    /*释放资源
    * 所有方法执行完后都会 执行此方法*/
    @After
    public void close(){
        System.out.println("close......");
    }

    @Test
    public void testAdd(){
        //System.out.println("finished");
        Calculator c = new Calculator();
        //int d = 3/0;
        //System.out.println(d);
        int result = c.add(1,2);
        System.out.println("testAdd...");
        //断言
        Assert.assertEquals(3,result);
    }
}
