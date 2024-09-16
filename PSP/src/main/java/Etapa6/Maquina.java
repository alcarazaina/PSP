package Etapa6;

import java.util.Scanner;

public class Maquina {
    static Scanner teclado = new Scanner(System.in);
    private int agua;
    private int leche;
    private int cafe;
    private int vasos;
    private int dinero;

    public Maquina() {
        this.agua = 400;
        this.leche = 540;
        this.cafe = 120;
        this.vasos = 9;
        this.dinero = 550;
    }

    public Maquina(int agua, int leche, int cafe, int vasos, int dinero) {
        this.agua = agua;
        this.leche = leche;
        this.cafe = cafe;
        this.vasos = vasos;
        this.dinero = dinero;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getLeche() {
        return leche;
    }

    public void setLeche(int leche) {
        this.leche = leche;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void maquinaCafe(){
        System.out.println("La máquina de café tiene:\n" +
                agua+ " ml de agua\n" +
                leche+ " ml de leche\n" +
                cafe+ " g de café\n" +
                vasos+ " vasos desechables\n" +
                "$"+dinero +" en efectivo");
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
    private void fill(Maquina maquina){
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
    private void take(Maquina maquina){
        maquina.setDinero(0);
    }
    public void menu(Maquina maquina){
        maquina = new Maquina();
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
                maquina.maquinaCafe();
            }
        }while (!letra.equalsIgnoreCase("exit"));
    }
}
