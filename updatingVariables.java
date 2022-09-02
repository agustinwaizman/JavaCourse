package com.platzi;

public class updatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono 200

        salary += 200;
        System.out.println(salary);

        //alquiler: 50 descuento

        salary -= 50;
        System.out.println(salary);

        //2hs extra, 30 c/u
        //comida: 45

        salary = salary + (30*2) - 45;

        System.out.println(salary);

        // actualizando strings

        String employeeName = "Agustin Waizman";
        employeeName = "Franco " + employeeName;
        System.out.println(employeeName);
    }
}
