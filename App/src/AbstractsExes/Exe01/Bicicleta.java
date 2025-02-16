/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta
CLASSE: Bicicleta
 */

package Exe01;

class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está pedalando.");
    }
}