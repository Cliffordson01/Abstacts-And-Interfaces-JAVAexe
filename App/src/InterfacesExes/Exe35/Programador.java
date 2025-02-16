/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Funcionario com o método calcularSalario() e implemente-a nas classes Gerente e Programador.
CLASSE: Programador
 */
package Exe35;

 class Programador implements IFuncionario {
    @Override
    public void calcularSalario(){
        System.out.println( "Salario do programador calculado");
    }
}
