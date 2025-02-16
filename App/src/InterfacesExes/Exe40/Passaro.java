/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Animal com o método comer(), e uma outra interface Voador com o método voar(), e implemente ambas na classe Passaro.
CLASSE: Passaro
 */
package Exe40;

 class Passaro implements IAnimal, IVoador {
    @Override 
    public void comer(){
        System.out.println("O Passaro comeu");
    }

    @Override
    public void voar(){
        System.out.println("O Passaro Voa");
    }
}
