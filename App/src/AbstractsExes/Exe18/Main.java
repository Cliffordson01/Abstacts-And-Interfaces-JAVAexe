
/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Jogo com um método iniciar(), e implemente JogoAventura e JogoCorrida.
CLASSE: Main
 */

package Exe18;

public class Main {
    public static void main(String[] args) {
        JogoAventura jogoAventura = new JogoAventura();
        JogoCorrida jogoCorrida = new JogoCorrida();
         
        jogoAventura.iniciar();
        jogoCorrida.iniciar();
    }
}
