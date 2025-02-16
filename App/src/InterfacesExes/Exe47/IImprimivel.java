/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Imprimivel adicionando um método default chamado
mostrarNoMonitor(), que imprime "Exibindo no monitor", e implemente-a na classe Documento.
INTERFACE: IImprimivel
 */
package Exe47;

public interface IImprimivel {
    default void mostrarNoMonitor(){
        System.out.println("Exibindo no monitor");
    }
    
} 