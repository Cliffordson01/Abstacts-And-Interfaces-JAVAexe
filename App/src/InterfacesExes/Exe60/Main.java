/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Musica com os métodos play(), pause(), stop(), e implemente-a nas classes Spotify e Deezer.
CLASSE: Main
 */
package Exe60;

public class Main {
    public static void main(String[] args) {
        IMusica spotify = new Spotify();
        IMusica deezer = new Deezer();

        spotify.play();
        spotify.stop();

        deezer.play();
        deezer.stop();
    }
}
