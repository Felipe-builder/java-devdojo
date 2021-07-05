package br.com.abc.javacore.dio.date.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ManipuladoLocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(ontem);

        LocalTime agora = LocalTime.now();

        System.out.println(agora);

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);

        LocalDateTime hojeLocalTime = LocalDateTime.now();

        LocalDateTime futuro = hojeLocalTime.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
    }
}
