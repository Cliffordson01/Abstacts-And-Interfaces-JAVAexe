/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago
CLASSE: Main
 */

package Exe10;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();

        guerreiro.atacar();
        guerreiro.defender();
        
        mago.defender();
        mago.atacar();
    }
}
