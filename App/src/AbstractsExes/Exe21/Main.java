/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe RedeSocial com métodos postar() e curtir(), e implemente Facebook e Twitter.
CLASSE: Main
 */

package Exe21;

public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();

        facebook.postar();
        facebook.curtir();

        twitter.postar();
        twitter.curtir();
    }
}
