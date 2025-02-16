/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Pagamento com um método realizarPagamento(), e implemente CartaoCredito e BoletoBancario.
CLASSE: BoletoBancario
 */
package Exe24;

 class BoletoBancario extends Pagamento {
    @Override
    public void realizarPagamento(){
        System.out.println("O pagamento sera realizado no Boleto Bancario");
    }
    
}
