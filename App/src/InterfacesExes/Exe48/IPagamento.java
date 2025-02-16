/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Pagamento adicionando um método default chamado
cancelarPagamento() e implemente-a nas classes CartaoCredito e Pix
INTERFACE: IPagamento
 */
package Exe48;

public interface IPagamento {
    default void cancelarPagamento(){
        System.out.println("Pagamento Cancelado");
    }
    
} 
