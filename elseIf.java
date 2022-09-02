package com.platzi;

public class elseIf {
    public static void main(String[] args) {
        boolean bluetooth = true;
        int archivosEnviados = 0;

        for(int i = 0; i < 10; i++) {
            if (bluetooth){
                archivosEnviados++;
                System.out.println("se han enviado " + archivosEnviados + " archivos");
            } else {
                System.out.println("Por favor enciende tu bluetooth");
            }
        }
    }
}
