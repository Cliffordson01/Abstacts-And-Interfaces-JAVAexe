/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Pagamento com o método pagar(), e implemente-a nas classes CartaoCredito e Boleto.
CLASSE: CartaoCredito
 */
package Exe42;

 class CartaoCredito implements IPagamento {
    @Override
    public void pagar(){
        System.out.println("Pago com cartao de credito");
    }
}
