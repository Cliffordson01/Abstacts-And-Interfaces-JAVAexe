/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Eletrodomestico com os métodos ligar() e desligar(), e implemente-a nas classes Geladeira e Televisao.
CLASSE: Main
 */
package Exe33;

public class Main {
    public static void main(String[] args) {
        IEletrodomestico geladeira = new Geladeira();
        IEletrodomestico televisao = new Televisao();

        geladeira.ligar();
        geladeira.desligar();

        televisao.ligar();
        televisao.desligar();
    }
}
