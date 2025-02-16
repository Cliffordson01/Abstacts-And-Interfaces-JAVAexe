/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Horario que retorna a hora atual e implemente-a na classe Relogio.
CLASSE: Main
 */
package Exe55;

public class Main {
    public static void main(String[] args) {
        IHorario relogio = new Relogio();

        relogio.HoraAtual();  
    }
}
