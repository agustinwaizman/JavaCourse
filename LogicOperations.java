package com.platzi;

public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores de asignacion
        System.out.println("A es igual a B? -> " + (a == b));
        System.out.println("A es diferente a B? -> " + (a != b));

        //operadores relacionales
        System.out.println("A es mayor a B? -> " + (a > b));
        System.out.println("A es menor a B? -> " + (a < b));
        System.out.println("A es mayor o igual a B? -> " + (a >= b));
        System.out.println("A es menor o igual a B? -> " + (a <= b));

        if (a == b){
            System.out.println("A es igual que B");
        }else if(a != b){
            System.out.println("A es diferente que B");
        }else if(a > b){
            System.out.println("A es mayor que B");
        }else if(a < b){
            System.out.println("A es menor que B");
        }else if(a >= b){
            System.out.println("A es mayor o igual que B");
        }else if(a <= b){
            System.out.println("A es menor o igual que B");
        }


    }
}
