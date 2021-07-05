package br.com.abc.javacore.dio.date.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio3 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        String dateToString = DateFormat.getInstance().format(date);
        System.out.println(dateToString);

        dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(date);
        System.out.println(dateToString);
        dateToString = DateFormat.getDateTimeInstance().format(date);
        System.out.println(dateToString);
        dateToString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(date);
        System.out.println(dateToString);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");
        String dateFormated = formatter.format(date);
        System.out.println(dateFormated);
    }
}
