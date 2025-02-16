/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Eletrodomestico adicionando um método default chamado
verificarEstado() e implemente-a na classe Microondas.
CLASSE: Main
 */
package Exe50;

public class Main {
    public static void main(String[] args) {
        IEletrodomestico microonda = new Microondas();
        
        microonda.verificarEstado();
    }
}
