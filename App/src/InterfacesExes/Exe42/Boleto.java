/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Pagamento com o método pagar(), e implemente-a nas classes CartaoCredito e Boleto.
CLASSE: Boleto
 */

package Exe42;

class Boleto implements IPagamento{
    @Override
    public void pagar(){
        System.out.println("Pago no boleto");
    }
}
