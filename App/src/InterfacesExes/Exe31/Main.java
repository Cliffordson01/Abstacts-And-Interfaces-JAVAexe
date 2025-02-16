/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Veiculo com o método acelerar() e implemente-a nas classes Carro e Moto.
CLASSE: Main
 */
package Exe31;

public class Main {
    public static void main(String[] args) {
        IVeiculo carro = new Carro();
        IVeiculo moto = new Moto();

        carro.acelerar(); // Saída: Carro acelerando...
        moto.acelerar();  // Saída: Moto acelerando...
    }
}