package Etapa3;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe cuántos ml de agua tiene la máquina:");
        int agua = teclado.nextInt();
        System.out.println("Escribe cuántos ml de leche tiene la máquina:");
        int leche = teclado.nextInt();
        System.out.println("Escribe cuántos gramos de café tiene la máquina:");
        int cafe = teclado.nextInt();
        System.out.println("Escribe cuántas tazas de café necesitas hacer:");
        int tazas = teclado.nextInt();


        if (agua/200 >= tazas && leche/50 >= tazas && cafe/15 >= tazas){
            int n = 0;
            while (agua >= 200 && leche >= 50 && cafe >= 15){
                n++;
                agua = agua - 200;
                leche = leche - 50;
                cafe = cafe - 15;
            }
            n = n - tazas;
            System.out.println("Sí, puedo hacer esa cantidad de café (e incluso " +  n + " tazas más)");
        }
        else {
            int n = 0;
            while (agua >= 200 && leche >= 50 && cafe >= 15){
                n++;
                agua = agua - 200;
                leche = leche - 50;
                cafe = cafe - 15;
            }
            System.out.println("No, sólo puedo hacer " + n + " taza(s) de café");
        }
    }
}
