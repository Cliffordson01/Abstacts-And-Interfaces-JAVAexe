/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Utilitario que calcula o fatorial de um número e implemente-a na classe Matematica.
INTERFACE: IUtilitario
 */
package Exe53;

public interface IUtilitario {
    default void fatorial(){
        System.out.println("O fatorial de 5 é 120");
    }
    
} 