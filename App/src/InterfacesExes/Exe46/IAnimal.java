/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Animal adicionando um método default chamado dormir() que imprime"Zzz...", e implemente-a na classe Cachorro.
INTERFACE: IAnimal
 */
package Exe46;

public interface IAnimal {
    default void dormir(){
        System.out.println("Zzz...");
    }
    
} 
