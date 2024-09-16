package Etapa5;

public class Maquina {
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
}
