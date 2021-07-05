package br.com.abc.javacore.dio.date.classes;

import java.time.Instant;
import java.util.Date;

public class ManipulaDatas {

    public static Date exemplo1(Date data) {
        return data;
    }

    public static Date exemplo2(Date data, Long currentTimeMillis){
        System.out.println(currentTimeMillis);
        return data;
    }

    public static boolean exemplo3(Date beforeDate, Date afterData){
        return  beforeDate.after(afterData);
    }

    public static boolean exemplo4(Date beforeDate, Date afterData){
        return  beforeDate.before(afterData);
    }

    public static void exemplo5(Date beforeDate, Date afterDate, Date newAfterDate){
        System.out.println(afterDate.equals(newAfterDate));
        System.out.println("COMPARE 1: "  + beforeDate.compareTo(afterDate));
        System.out.println("COMPARE 2: " + afterDate.compareTo(beforeDate));
        System.out.println("COMPARE 3: " + afterDate.compareTo(newAfterDate));
    }

    public static Instant exemplo6(Date date){
        return  date.toInstant();
    }
}
