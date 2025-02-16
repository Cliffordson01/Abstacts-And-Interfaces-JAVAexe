/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface OperacoesMatematicas adicionando um método default chamado
potencia() e implemente-a na classe CalculadoraCientifica.
CLASSE: Main
 */
package Exe49;

public class Main {
    public static void main(String[] args) {
        IOperacoesMatematicas calculadoraCientifica = new CalculadoraCientifica();

        calculadoraCientifica.potencia();
    }
}
