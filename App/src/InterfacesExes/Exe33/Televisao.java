/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Eletrodomestico com os métodos ligar() e desligar(), e implemente-a nas classes Geladeira e Televisao.
CLASSE: Televisao
 */
package Exe33;

 class Televisao implements IEletrodomestico {
    @Override
    public void ligar(){
        System.out.println("A televisao esta ligada");

    }
    public void desligar(){
        System.out.println("A televisao esta desligada");
    }
}
