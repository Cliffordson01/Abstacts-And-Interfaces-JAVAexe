/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago
CLASSE: Mago
 */

package Exe10;

class Mago extends Personagem {
    @Override
    public void  defender(){
        System.out.println("O Mago Defende o ataque o do guerreiro");
    }
    public void atacar(){
        System.out.println("E atacou o ponto frago do guerreiro");
    }
}
