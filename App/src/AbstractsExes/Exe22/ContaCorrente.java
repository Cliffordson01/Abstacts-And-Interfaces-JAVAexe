/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe ContaBancaria com métodos sacar() e depositar(), e implemente ContaCorrente e ContaPoupanca.
CLASSE: ContaCorrente
 */

package Exe22;

 class ContaCorrente extends ContaBancaria {
    @Override
    public void sacar(){
        System.out.println("3 MIL foi sacado na conta CORRENTE");
    }
    public void depositar(){
        System.out.println("10 MIL foi depositado na conta CORRENTE");
    }
}
