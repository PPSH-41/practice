package stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.stream.Stream;

public class Demo01StreamForeach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //stream.forEach(name-> System.out.println(name));
        stream.forEach(System.out::println);//方法引用
    }
}
