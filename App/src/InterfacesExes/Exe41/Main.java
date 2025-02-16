/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Jogavel com o método iniciarJogo(), e implemente-a nas classes Xadrez e Futebol.
CLASSE: Main
 */
package Exe41;

public class Main {
    public static void main(String[] args) {
        IJogavel xadrez = new Xadrez();
        IJogavel futebol = new Futebol();

        xadrez.iniciarJogo();
        futebol.iniciarJogo();
    }
}
