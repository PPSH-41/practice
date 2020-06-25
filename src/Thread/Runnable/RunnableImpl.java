package Thread.Runnable;

import org.omg.PortableServer.THREAD_POLICY_ID;

//1创建runnable接口实现类
public class RunnableImpl implements Runnable{
//    2设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);

        }
    }
}
