/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface OperacoesMatematicas com os métodos somar(), subtrair(), multiplicar() e dividir(), e implemente-a na classe Calculadora.
CLASSE: Main
 */

package Exe38;

public class Main {
    public static void main(String[] args) {
        IOperacoesMatematicas calculadora = new Calculadora();
        
        calculadora.somar();
        calculadora.subtrair();
        calculadora.multiplicar();
        calculadora.dividir();
    }
}
