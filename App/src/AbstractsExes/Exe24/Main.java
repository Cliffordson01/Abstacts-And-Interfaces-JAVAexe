/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Pagamento com um método realizarPagamento(), e implemente CartaoCredito e BoletoBancario.
CLASSE: Main
 */

package Exe24;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        BoletoBancario boletoBancario = new BoletoBancario();

        cartaoCredito.realizarPagamento();
        boletoBancario.realizarPagamento();
    }
}
