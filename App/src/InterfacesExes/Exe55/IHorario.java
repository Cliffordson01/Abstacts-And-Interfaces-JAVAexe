/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Horario que retorna a hora atual e implemente-a na classe Relogio.
INTERFACE: IHorario
 */
package Exe55;

public interface IHorario {
    default void HoraAtual(){
        System.out.println("Sao 11:31 AM ");
    }
}
