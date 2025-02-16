/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Livro com um método abrir(), e implemente Ebook e LivroFisico.
CLASSE: Main
 */

package Exe25;

public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        LivroFisico livroFisico = new LivroFisico();

        ebook.abrir();
        livroFisico.abrir();
    }
}
