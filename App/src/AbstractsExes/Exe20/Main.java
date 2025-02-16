/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Computador com um método processar(), e implemente Desktop e Notebook
CLASSE: Main
 */
package Exe20;

public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        Notebook notebook = new Notebook();

        desktop.processar();
        notebook.processar();
    }
}
