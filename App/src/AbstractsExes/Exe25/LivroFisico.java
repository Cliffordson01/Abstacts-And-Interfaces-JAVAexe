/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Livro com um método abrir(), e implemente Ebook e LivroFisico.
CLASSE: LivroFisico
 */

package Exe25;

 class LivroFisico extends Livro{
    @Override
    public void abrir(){
        System.out.println("Abrir o livro");
    }
}
