/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Animal com o método comer(), e uma outra interface Voador com o método voar(), e implemente ambas na classe Passaro.
CLASSE: Main
 */
package Exe40;

public class Main {
    public static void main(String[] args) {
        IAnimal animal = new Passaro();
        IVoador passaro = new Passaro();

        animal.comer();
        passaro.voar();
    }
}
