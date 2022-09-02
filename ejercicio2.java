package com.platzi;

public class ejercicio2 {
    public static void main(String[] args) {
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        int i = 250;
        long iL = i;
        System.out.println(iL);
        short iS = (short) iL;
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL);

        int j = 100;
        System.out.println(j + 5000.66);

        int k = 737;
        k = k*100;
        byte kB = (byte) k;
        System.out.println(kB);

        double w = 298.638;
        w = 298.638 / 25;
        long wL = (long) w;
        System.out.println(wL);
    }
}
