/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Veiculo com o método acelerar() e implemente-a nas classes Carro e Moto.
CLASSE: Carro
 */
package Exe31;

class Carro implements IVeiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
}
