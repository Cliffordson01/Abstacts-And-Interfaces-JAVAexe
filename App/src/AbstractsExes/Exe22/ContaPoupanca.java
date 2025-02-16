/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe ContaBancaria com métodos sacar() e depositar(), e implemente ContaCorrente e ContaPoupanca.
CLASSE: ContaPoupanca
 */

package Exe22;

 class ContaPoupanca extends ContaBancaria{
    @Override
    public void sacar(){
        System.out.println("20 MIL reais foi sacado na conta POUPANCA");
    }
    public void depositar(){
        System.out.println("50 MIL reais foi depositado na conta POUPANCA");
    }
}
