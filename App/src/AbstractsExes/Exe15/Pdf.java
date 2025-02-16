/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word
CLASSE: Pdf
 */

package Exe15;

class Pdf extends Documento{
    @Override
    public void imprimir(){
        System.out.println("PDF esta sendo impresso");
    }
}
