package com.platzi;

public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Blue Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Se ha activado Light Mode");
                break;
            case "Night":
                System.out.println("Se ha activado Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Se ha activado Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Se ha activado Dark Mode");
                break;
            default:
                System.out.println("Debes seleccionar una opcion valida");
        }
    }
}
