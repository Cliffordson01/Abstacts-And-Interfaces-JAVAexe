/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Nadador e Corredor, implemente ambas na classe Triatleta.
CLASSE: Main
 */
package Exe36;

public class Main {
    public static void main(String[] args) {
        INadador nadador = new Triatleta();
        ICorredor corredor = new Triatleta();

        nadador.nadar();
        corredor.correr();
    }
}
