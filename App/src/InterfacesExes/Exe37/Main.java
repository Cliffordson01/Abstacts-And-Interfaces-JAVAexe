/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Banco com métodos sacar(), depositar() e verSaldo(), e implemente-a na classe ContaCorrente
CLASSE: Main
 */
package Exe37;

public class Main {
    public static void main(String[] args) {
        IBanco conta = new ContaCorrente();

        conta.sacar();
        conta.depositar();
        conta.verSaldo();
    }
}
