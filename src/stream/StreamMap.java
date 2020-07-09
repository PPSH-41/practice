package stream;

import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        //Stream stream2 = Stream.map(s->Integer.parseInt(s));
        //stream2.forEach(i-> System.out.println(i));

    }
}
