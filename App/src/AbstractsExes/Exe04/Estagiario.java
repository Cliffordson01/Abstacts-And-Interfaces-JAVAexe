/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario.
e Estagiario.
CLASSE: Estagiario
 */
package Exe04;

public class Estagiario extends Funcionario {
    @Override 
    public void calcularSalario(){
        System.out.println("O salario do estagiario e de: 2000 reais");
    }
}
