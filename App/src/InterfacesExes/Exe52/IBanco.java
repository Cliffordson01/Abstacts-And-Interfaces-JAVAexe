/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Banco que retorna a taxa de juros atual e implemente-a na classe ContaPoupanca.
INTERFACE: IBanco
 */
package Exe52;

public interface IBanco {
    default void TaxaAtual(){
        System.out.println("25 Porcento de juros");
    }
}
