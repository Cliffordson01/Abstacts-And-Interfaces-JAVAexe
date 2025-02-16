/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago
CLASSE: Guerreiro
 */

package Exe10;

class Guerreiro extends Personagem {
    @Override
    public void atacar(){
        System.out.println("O Guerreiro Contratacou o Mago");
    }
    public void defender(){
        System.out.println("Expondo o seu ponto fraco");
    }
}
