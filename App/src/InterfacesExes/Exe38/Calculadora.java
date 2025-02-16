/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface OperacoesMatematicas com os métodos somar(), subtrair(), multiplicar() e dividir(), e implemente-a na classe Calculadora.
CLASSE: Calculadora
 */

package Exe38;

 class Calculadora implements IOperacoesMatematicas{
    @Override
    public void somar(){
        System.out.println("O valor e somado");
    }
    public void subtrair(){
        System.out.println("O valor e subtraido");
    }
    public void multiplicar(){
        System.out.println("O valor e multiplicado");

    }
    public void dividir(){
        System.out.println("O valor e dividido");
    }
}
