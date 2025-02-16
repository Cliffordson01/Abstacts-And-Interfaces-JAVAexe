/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface ControleRemoto com os métodos aumentarVolume() e diminuirVolume(), implemente-a na classe Televisao.
CLASSE: Main
 */
package Exe45;

public class Main {
    public static void main(String[] args) {
        IControleRemoto televisao = new Televisao();
        
        televisao.aumentarVolume();
        televisao.diminuirVolume();
    }
}
