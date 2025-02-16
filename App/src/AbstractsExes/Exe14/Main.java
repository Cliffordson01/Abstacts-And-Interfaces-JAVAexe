/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Transporte que tenha um método abstrato velocidadeMaxima(), e implemente Moto e Caminhão.
CLASSE: Main
 */

package Exe14;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();

        moto.velocidadeMaxima();
        caminhao.velocidadeMaxima();
    }
}
