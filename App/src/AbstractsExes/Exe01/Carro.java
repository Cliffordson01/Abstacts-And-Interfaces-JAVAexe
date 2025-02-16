/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta
CLASSE: Carro
 */

package Exe01;

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está andando.");
    }
}