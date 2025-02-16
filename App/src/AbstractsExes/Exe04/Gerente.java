/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario.
e Estagiario.
CLASSE: Gerente
 */

package Exe04;

class Gerente extends Funcionario {
    @Override
    public void calcularSalario(){
        System.out.println("O  salario do gerente e de: 10000 reais");
    }
}
