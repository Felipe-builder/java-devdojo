package br.com.abc.javacore.dio.date.testes;

import br.com.abc.javacore.dio.date.classes.ManipulaDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Date novaData = new Date();
        Long currentTimeMillis = System.currentTimeMillis();
        Date novaData1 = new Date(currentTimeMillis);

        System.out.println("EXEMPLO 1");
        System.out.println(ManipulaDatas.exemplo1(novaData));
        System.out.println("\nEXEMPLO 2");
        System.out.println(ManipulaDatas.exemplo2(novaData1, currentTimeMillis));

        Date dataNoPassado = new Date(1513124807691L);
        Date dataNoFuturo = new Date(1613124807691L);
        Date mesmaDataNoFuturo = new Date(1613124807691L);

        System.out.println("\nEXEMPLO 3");
        System.out.println(ManipulaDatas.exemplo3(dataNoPassado, dataNoFuturo));
        System.out.println("\nEXEMPLO 4");
        System.out.println(ManipulaDatas.exemplo4(dataNoPassado, dataNoFuturo));

        System.out.println("\nEXEMPLO 5");
        ManipulaDatas.exemplo5(dataNoPassado, dataNoFuturo, mesmaDataNoFuturo);

        System.out.println("\nEXEMPLO 6");
        System.out.println(ManipulaDatas.exemplo6(dataNoFuturo));
        System.out.println("\nDATA NO FUTURO");
        System.out.println(ManipulaDatas.exemplo1(dataNoFuturo));

        String myDate = "1995/07/28";
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/MM/dd");
        Date dateBorn = simpleDate.parse(myDate);
        System.out.println("\nDATEBORN1");
        System.out.println(dateBorn);

        Long millisBorn = dateBorn.getTime();
        System.out.println("\nEXERCICIO");
        System.out.println(millisBorn);
        Date dateBorn1 = new Date(millisBorn);
        System.out.println(dateBorn1);

        String myDate2 = "2010/05/15";
        Date dateCinoared = simpleDate.parse(myDate2);
        Long millis = dateCinoared.getTime();
        Date dateCompared = new Date(millis);

        System.out.println(dateBorn1.compareTo(dateCompared));
        System.out.println(dateCinoared.compareTo(dateBorn1));
    }
}
