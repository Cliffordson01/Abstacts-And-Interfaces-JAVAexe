/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Livro com um método abrir(), e implemente Ebook e LivroFisico.
CLASSE: Ebook
 */

package Exe25;

 class Ebook extends Livro{
    @Override
    public void abrir(){
        System.out.println("Acessar o EBOOK");
    }
}
