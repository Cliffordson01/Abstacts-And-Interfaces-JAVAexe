/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Banco com um método abstrato realizarTransacao(), e implemente Deposito e Saque.
CLASSE: Saque
 */

package Exe09;

 class Saque extends Banco {
    @Override
    public void realizarTransacao(){
        System.out.println("Saque Realizado");
    }
}
