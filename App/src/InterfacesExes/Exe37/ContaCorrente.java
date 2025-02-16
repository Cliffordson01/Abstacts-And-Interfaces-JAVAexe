/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Banco com métodos sacar(), depositar() e verSaldo(), e implemente-a na classe ContaCorrente
CLASSE: ContaCorrente
 */
package Exe37;

 class ContaCorrente implements IBanco {
    @Override
    public void sacar(){
        System.out.println("O valor X  foi sacado");
    }
    public void depositar(){
        System.out.println("O valor Y foi depositado");
    }
    public void verSaldo(){
        System.out.println("O saldo atual é positivo");
    }
}
