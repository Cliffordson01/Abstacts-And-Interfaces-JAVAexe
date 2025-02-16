/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Eletrodomestico adicionando um método default chamado
verificarEstado() e implemente-a na classe Microondas.
INTERFACE: IEletrodomestico
 */
package Exe50;

public interface IEletrodomestico {
    default void verificarEstado(){
        System.out.println("Verificando o estado");
    }
}
