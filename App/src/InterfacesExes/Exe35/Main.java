/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Funcionario com o método calcularSalario() e implemente-a nas classes Gerente e Programador.
CLASSE: Main
 */
package Exe35;

public class Main {
    public static void main(String[] args) {
        IFuncionario gerente = new Gerente();
        IFuncionario programador = new Programador();

        gerente.calcularSalario();
        programador.calcularSalario();
    }
}
