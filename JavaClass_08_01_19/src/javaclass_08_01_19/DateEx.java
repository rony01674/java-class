package javaclass_08_01_19;

import java.util.Date;

public class DateEx {

    public static void main(String[] args) {
        System.out.println(new Date());

        Date date = new Date();
        System.out.println("Time in ms: " + date.getTime());
    }
}
