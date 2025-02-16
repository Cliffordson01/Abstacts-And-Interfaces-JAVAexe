/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Movivel com os métodos moverParaFrente() e moverParaTras(), implementea na classe Robo
CLASSE: Robo
 */
package Exe58;

 class Robo implements IMovivel {
    @Override
    public void moverParaFrente(){
        System.out.println("Robo vai para frente");

    }
    public void moverParaTras(){
        System.out.println("Robo vai para tras");
    }
}
