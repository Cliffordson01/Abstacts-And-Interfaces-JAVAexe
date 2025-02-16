/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word
CLASSE: Main
 */

package Exe15;

public class Main {

    public static void main(String[] args) {
        Pdf pdf = new Pdf();
        Word word = new Word();

        pdf.imprimir();
        word.imprimir();
        
    }
}