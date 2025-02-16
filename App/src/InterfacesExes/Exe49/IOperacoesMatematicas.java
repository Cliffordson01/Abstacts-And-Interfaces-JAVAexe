/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface OperacoesMatematicas adicionando um método default chamado
potencia() e implemente-a na classe CalculadoraCientifica.
INTERFACE: IOperacoesMatematicas
 */
package Exe49;

public interface IOperacoesMatematicas {
    default void potencia() {
        System.out.println("Calculando potencia");
    }
    
} 