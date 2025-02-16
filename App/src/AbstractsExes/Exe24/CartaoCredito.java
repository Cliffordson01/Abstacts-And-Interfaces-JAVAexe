/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Pagamento com um método realizarPagamento(), e implemente CartaoCredito e BoletoBancario.
CLASSE: CartaoCredito
 */
package Exe24;

 class CartaoCredito extends Pagamento{
    @Override
    public void realizarPagamento(){
        System.out.println("O pagamento sera realizado no Cartao de Credito");
    }
}
