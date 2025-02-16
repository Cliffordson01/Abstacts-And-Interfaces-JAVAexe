/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Pagamento adicionando um método default chamado
cancelarPagamento() e implemente-a nas classes CartaoCredito e Pix
CLASSE: Main
 */
package Exe48;

public class Main {
    public static void main(String[] args) {
        IPagamento cartaoCredito = new CartaoCredito();
        IPagamento pix = new Pix();

        cartaoCredito.cancelarPagamento();
        pix.cancelarPagamento();
    }
}
