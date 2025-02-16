/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta
CLASSE: Main
 */

package Exe01;

public class Main{
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}

