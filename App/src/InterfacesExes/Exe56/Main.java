/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Transmissivel com os métodos iniciarTransmissao() e finalizarTransmissao(), e implemente-a nas classes Youtube e Twitch.
CLASSE: Main
 */
package Exe56;

public class Main {
    public static void main(String[] args) {
        ITransmissivel youtube = new Youtube();
        ITransmissivel twitch = new Twitch();

        youtube.iniciarTransmissao();
        youtube.finalizarTransmissao();

        twitch.iniciarTransmissao();
        twitch.finalizarTransmissao();
    }
}
