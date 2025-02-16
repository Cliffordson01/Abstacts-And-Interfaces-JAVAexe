/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Banco que retorna a taxa de juros atual e implemente-a na classe ContaPoupanca.
CLASSE: Main
 */
package Exe52;

public class Main {
    public static void main(String[] args) {
        IBanco contaPoupanca = new ContaPoupanca();

        contaPoupanca.TaxaAtual();
    }
}
