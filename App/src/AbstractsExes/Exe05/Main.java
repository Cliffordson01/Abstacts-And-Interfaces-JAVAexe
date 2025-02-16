/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.
CLASSE: Main
 */

package Exe05;

public class Main {
public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();

    cachorro.fazerSom();
    gato.fazerSom();
}
     
}