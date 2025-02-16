/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Funcionario com o método calcularSalario() e implemente-a nas classes Gerente e Programador.
CLASSE: Gerente
 */
package Exe35;

class Gerente implements IFuncionario {
    @Override
    public void calcularSalario(){
        System.out.println("Salario do gerente calculado");
    }
}
