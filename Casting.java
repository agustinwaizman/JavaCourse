package com.platzi;

public class Casting {
    public static void main(String[] args) {
        double perrosMensuales = 30.0 / 12.0;
        System.out.println(perrosMensuales);

        int estimadoMensual = (int) perrosMensuales;
        System.out.println(estimadoMensual);

        int a = 30;
        int b = 12;
        System.out.println((double) a / b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
