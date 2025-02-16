/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Banco com um método abstrato realizarTransacao(), e implemente Deposito e Saque.
CLASSE: Main
 */

package Exe09;

public class Main {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Saque saque = new Saque();

        deposito.realizarTransacao();
        saque.realizarTransacao();
    }
}
