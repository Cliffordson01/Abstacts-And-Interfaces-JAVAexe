/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Pagamento com o método pagar(), e implemente-a nas classes CartaoCredito e Boleto.
CLASSE: Main
 */
package Exe42;

public class Main {
    public static void main(String[] args) {
        IPagamento cartaocredito = new CartaoCredito();
        IPagamento boleto = new Boleto();

        cartaocredito.pagar();
        boleto.pagar();
    }
}
