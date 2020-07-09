package JAVA.lambda.Demo03;

import java.util.Arrays;


public class DemoArray {
    public static void main(String[] args) {
        Person[] arr ={
                new Person("小白",12),
                new Person("小黑",13),
                new Person("tom",14)
        };
        /*Arrays.sort(arr,new Comparator<Person>(){
            @Override
            public int compare(Person o1,Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        //lambda表达式
        //Arrays.sort(arr,(Person o1,Person o2) ->{
      //      return o1.getAge()-o2.getAge();

       // });

        //优化
        Arrays.sort(arr,(o1,o2) -> o1.getAge()-o2.getAge());

        for (Person p : arr
             ) {
            System.out.println(p);
        }
    }
}
