/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Movivel com os métodos moverParaFrente() e moverParaTras(), implementea na classe Robo
CLASSE: Main
 */
package Exe58;

public class Main {
    public static void main(String[] args) {
        IMovivel robo = new Robo();

        robo.moverParaFrente();
        robo.moverParaTras();

    }
}
