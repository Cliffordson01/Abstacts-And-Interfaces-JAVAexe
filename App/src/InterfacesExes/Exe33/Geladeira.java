/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Eletrodomestico com os métodos ligar() e desligar(), e implemente-a nas classes Geladeira e Televisao.
CLASSE: Geladeira
 */
package Exe33;

 class Geladeira implements IEletrodomestico {
    @Override
    public void ligar(){
        System.out.println(" A geladeira esta ligada");
    }
    public void desligar(){
        System.out.println( "A geladeira esta desligada");
    }
}
