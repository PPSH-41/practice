package stream;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("小白", "小黑", "大白", "大黑", "大黄");
        Stream<String> stream2 = stream.filter(name -> name.startsWith("小"));
        stream2.forEach(name-> System.out.println(name));

    }
}
