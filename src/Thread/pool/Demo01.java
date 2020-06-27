package Thread.pool;
//线程池的工厂类，用于生成线程池 executors
//接口
import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//ExecutorService的submit方法，传递线程任务（实现类），开启线程执行run方法
//                          shutdown方法销毁线程池（不建议执行）
public class Demo01 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());


    }
}
