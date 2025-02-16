/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Aula com um método ministrar(), e implemente Matematica e Portugues.
CLASSE: Main
 */

package Exe29;

public class Main {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        Portugues portugues = new Portugues();

        matematica.ministrar();
        portugues.ministrar();
    }
}
