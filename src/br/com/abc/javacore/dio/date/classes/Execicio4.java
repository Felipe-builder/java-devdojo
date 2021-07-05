package br.com.abc.javacore.dio.date.classes;

import java.time.LocalDateTime;

public class Execicio4 {
    public static void main(String[] args) {
        LocalDateTime dataDef = LocalDateTime.of(2010, 5,15, 10, 0, 0);
        LocalDateTime futuro = dataDef.plusYears(4).plusMonths(6).minusHours(13);
        System.out.println(futuro);
    }
}
