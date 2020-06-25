package staticTest;

import java.time.LocalDate;
import java.util.Date;

public class time {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        Date t = new Date();
        System.out.println(t);
    }
}

