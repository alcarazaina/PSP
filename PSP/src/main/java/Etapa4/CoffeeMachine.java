package Etapa4;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
    Maquina maquina = new Maquina();
    maquinaCafe(maquina.getAgua(), maquina.getLeche(), maquina.getCafe(), maquina.getVasos(), maquina.getDinero());
    System.out.println();
    menu(maquina);
    }
    private static void maquinaCafe(int agua, int leche, int cafe,int vasos, int dinero){
        System.out.println("La máquina de café tiene:\n" +
                agua+ " ml de agua\n" +
                leche+ " ml de leche\n" +
                cafe+ " g de café\n" +
                vasos+ " vasos desechables\n" +
                "$"+dinero +" en efectivo");
    }
    private static void buy(int agua, int leche, int cafe, int vasos, int dinero){
        System.out.println("¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int numero = teclado.nextInt();
        switch (numero){
            case 1:
                if (agua/250 >= 1 && cafe/16 >= 1 && vasos>=1){
                    agua = agua - 250;
                    cafe = cafe - 16;
                    vasos = vasos - 1;
                    dinero = dinero + 4;
                }
                else {
                    System.out.println("Producto seleccionado no disponible");
                }
                break;
            case 2:
                if (agua/350 >= 1 && leche/75 >=1 && cafe/20 >= 1 && vasos>=1){
                    agua = agua - 350;
                    leche = leche - 75;
                    cafe = cafe - 20;
                    vasos = vasos - 1;
                    dinero = dinero + 7;
                }
                else {
                    System.out.println("Producto seleccionado no disponible");
                }
                break;
            case 3:
                if (agua/200 >= 1 && leche/100 >=1 && cafe/12 >= 1 && vasos>=1){
                    agua = agua - 200;
                    leche = leche - 100;
                    cafe = cafe - 12;
                    vasos = vasos - 1;
                    dinero = dinero + 6;
                }
                else {
                    System.out.println("Producto seleccionado no disponible");
                }
                break;
        }
        System.out.println("¡Gracias por comprar en Coffee Express!\n");
        maquinaCafe(agua,leche,cafe,vasos,dinero);
    }
    private static void fill(int agua, int leche, int cafe, int vasos, int dinero){
        System.out.println("Escribe cuántos ml de agua quieres añadir:");
        agua = agua + teclado.nextInt();
        System.out.println("Escribe cuántos ml de leche quieres añadir:");
        leche = leche + teclado.nextInt();
        System.out.println("Escribe cuántos gramos de café quieres añadir:");
        cafe = cafe + teclado.nextInt();
        System.out.println("Escribe cuántos vasos desechables quieres añadir:");
        vasos = vasos + teclado.nextInt();
        maquinaCafe(agua,leche,cafe,vasos,dinero);
    }
    private static void take(int agua, int leche, int cafe, int vasos, int dinero){
        dinero = 0;
        maquinaCafe(agua,leche,cafe,vasos,dinero);
    }
    private static void menu(Maquina maquina){
        System.out.println("Escribe la acción a realizar (buy, fill, take):");
        String letra = teclado.nextLine();
        if (letra.equalsIgnoreCase("buy")){
            buy(maquina.getAgua(), maquina.getLeche(), maquina.getCafe(), maquina.getVasos(), maquina.getDinero());
        } else if (letra.equalsIgnoreCase("fill")) {
            fill(maquina.getAgua(), maquina.getLeche(), maquina.getCafe(), maquina.getVasos(), maquina.getDinero());
        } else if (letra.equalsIgnoreCase("take")) {
            take(maquina.getAgua(), maquina.getLeche(), maquina.getCafe(), maquina.getVasos(), maquina.getDinero());
        } else {
            System.out.println("Error");
        }
    }
}
