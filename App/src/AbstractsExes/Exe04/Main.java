/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario.
e Estagiario.
CLASSE: Main
 */

package Exe04;

public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente();
        Estagiario estagiario = new Estagiario();

        gerente.calcularSalario();
        estagiario.calcularSalario();
    }
}