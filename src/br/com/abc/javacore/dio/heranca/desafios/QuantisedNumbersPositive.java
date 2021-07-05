package br.com.abc.javacore.dio.heranca.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuantisedNumbersPositive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x;
        int cont = 0;
        int positivos = 0;
//continue a solucao de acordo com o solicitado no enunciado

        while (cont < 6) {
            x = Double.parseDouble(br.readLine());
            if (x > 0) {
                positivos++;
            }
            cont++;
        }
        System.out.println(positivos + " valores positivos");


    }
}