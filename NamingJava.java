package com.platzi;

public class NamingJava {
    public static void main(String[] args) {

        int vidas = 5;
        vidas--;
        System.out.println(vidas);

        vidas++;
        System.out.println(vidas);

        int gift = 100 + ++vidas;
        System.out.println(gift);
    }
}
