package Etapa5;

import Etapa4.Maquina;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
    Maquina maquina = new Maquina();
    menu(maquina);
    }
    private static void maquinaCafe(Maquina maquina){
        System.out.println("La máquina de café tiene:\n" +
                maquina.getAgua()+ " ml de agua\n" +
                maquina.getLeche()+ " ml de leche\n" +
                maquina.getCafe()+ " g de café\n" +
                maquina.getVasos()+ " vasos desechables\n" +
                "$"+maquina.getDinero() +" en efectivo");
    }
    private static void buy(Maquina maquina){
        System.out.println("¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino, back - Menu principal: ");
        String numero = teclado.nextLine();
        switch (numero){
            case "1":
                if (maquina.getAgua()/250 >= 1 && maquina.getCafe()/16 >= 1 && maquina.getVasos()>=1){
                    maquina.setAgua(maquina.getAgua()-250);
                    maquina.setCafe(maquina.getCafe()-16);
                    maquina.setVasos(maquina.getVasos()-1);
                    maquina.setDinero(maquina.getDinero()+4);

                    System.out.println("Marchando un café");
                }
                else {
                    System.out.println("Producto seleccionado no disponible");
                    if (maquina.getAgua()/250 < 1){
                        System.out.println("No me queda agua");
                    }
                    if (maquina.getCafe()/16 < 1){
                        System.out.println("No me queda café");
                    }
                    if(maquina.getVasos() < 1){
                        System.out.println("No hay vasos disponibles");
                    }
                }
                break;
            case "2":
                if (maquina.getAgua()/350 >= 1 && maquina.getLeche()/75 >=1 && maquina.getCafe()/20 >= 1 && maquina.getVasos()>=1){
                    maquina.setAgua(maquina.getAgua()-350);
                    maquina.setLeche(maquina.getLeche()-75);
                    maquina.setCafe(maquina.getCafe()-20);
                    maquina.setVasos(maquina.getVasos()-1);
                    maquina.setDinero(maquina.getDinero()+7);
                    System.out.println("Marchando un café");
                }
                else {
                    System.out.println("Producto seleccionado no disponible");
                    if (maquina.getAgua()/350 < 1){
                        System.out.println("No me queda agua");
                    }
                    if (maquina.getLeche()/75 < 1){
                        System.out.println("No queda suficiente leche");
                    }
                    if (maquina.getCafe()/20 < 1){
                        System.out.println("No me queda café");
                    }
                    if(maquina.getVasos() < 1){
                        System.out.println("No hay vasos disponibles");
                    }
                }
                break;
            case "3":
                if (maquina.getAgua()/200 >= 1 && maquina.getLeche()/100 >=1 && maquina.getCafe()/12 >= 1 && maquina.getVasos()>=1){
                    maquina.setAgua(maquina.getAgua()-200);
                    maquina.setLeche(maquina.getLeche()-100);
                    maquina.setCafe(maquina.getCafe()-12);
                    maquina.setVasos(maquina.getVasos()-1);
                    maquina.setDinero(maquina.getDinero()+6);

                    System.out.println("Marchando un café");
                }
                else {
                    System.out.println("Producto seleccionado no disponible");
                    if (maquina.getAgua()/200 < 1){
                        System.out.println("No me queda agua");
                    }
                    if (maquina.getLeche()/100 < 1){
                        System.out.println("No queda suficiente leche");
                    }
                    if (maquina.getCafe()/12 < 1){
                        System.out.println("No me queda café");
                    }
                    if(maquina.getVasos() < 1){
                        System.out.println("No hay vasos disponibles");
                    }
                }
                break;
            case "back":
                break;
        }

    }
    private static void fill(Maquina maquina){
        System.out.println("Escribe cuántos ml de agua quieres añadir:");
        maquina.setAgua(maquina.getAgua() + teclado.nextInt());
        System.out.println("Escribe cuántos ml de leche quieres añadir:");
        maquina.setLeche(maquina.getLeche() + teclado.nextInt());
        System.out.println("Escribe cuántos gramos de café quieres añadir:");
        maquina.setCafe(maquina.getCafe() + teclado.nextInt());
        System.out.println("Escribe cuántos vasos desechables quieres añadir:");
        maquina.setVasos(maquina.getVasos() + teclado.nextInt());
        teclado.nextLine();
    }
    private static void take(Maquina maquina){
        maquina.setDinero(0);
    }
    private static void menu(Maquina maquina){
        String letra;
        do {
            System.out.println("Escribe la acción a realizar (buy, fill, take, remaining, exit):");
            letra = teclado.nextLine();
            if (letra.equalsIgnoreCase("buy")) {
                buy(maquina);
            } else if (letra.equalsIgnoreCase("fill")) {
                fill(maquina);
            } else if (letra.equalsIgnoreCase("take")) {
                take(maquina);
            } else if (letra.equalsIgnoreCase("remaining")) {
                maquinaCafe(maquina);
            }
        }while (!letra.equalsIgnoreCase("exit"));
    }
}
