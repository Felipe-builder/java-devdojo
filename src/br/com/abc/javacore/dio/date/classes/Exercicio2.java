package br.com.abc.javacore.dio.date.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercicio2 {
    public static void main(String[] args) throws ParseException {
        double divida = 1000.40;
        Calendar agora = Calendar.getInstance();
        Calendar vencimento = Calendar.getInstance();
        Date dateVacimento = new Date();
        vencimento.set(Calendar.YEAR, 2021);
        vencimento.set(Calendar.MONTH, Calendar.JULY);
        vencimento.set(Calendar.DAY_OF_MONTH, 30);
        vencimento.add(Calendar.DATE, 10);
        System.out.println(agora.getTime());
        System.out.println("Dia do Vencimento: " + vencimento.getTime());
        vencimento.add(Calendar.MONTH, -1);
        System.out.println("Você começará a pagar multa apartir da data: " + vencimento.getTime());

    }
}
