/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Nadador e Corredor, implemente ambas na classe Triatleta.
CLASSE: Triatleta
 */
package Exe36;

class Triatleta implements ICorredor, INadador{
    @Override
    public void correr(){
        System.out.println("Participou e vemceu a corrida");
    }

    @Override
    public void nadar(){
        System.out.println("Participou e venceu a natacao");
    }
}
