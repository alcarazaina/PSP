package Etapa2;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe cuántas tazas de café vas a necesitar:");
        int tazas = teclado.nextInt();
        System.out.println("Para " + tazas + " tazas de café necesitas: \n" +
                 tazas*200+" ml de agua\n" +
                tazas*50+" ml de leche\n" +
                tazas*15+" g de café");
    }
}
