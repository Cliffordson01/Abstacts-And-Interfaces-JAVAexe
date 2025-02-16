/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe AparelhoEletronico com um método ligar(), e implemente Celular e Tablet
CLASSE: Main
 */
package Exe16;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        Tablet tablet = new Tablet();

        celular.ligar();
        tablet.ligar();

    }
}
