
/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Adicione um método calcularBonificacao() à classe Funcionario, e sobrescreva em Gerente.
CLASSE: Gerente
 */

package Exe12;

class Gerente extends Funcionario {
    @Override
    public void calcularBonificacao(){
        System.out.println("O Bonus adicional e de 500 reais");
    }
    
}
