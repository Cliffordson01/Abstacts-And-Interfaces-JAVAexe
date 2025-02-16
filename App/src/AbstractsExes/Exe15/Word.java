/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word
CLASSE: Word
 */

package Exe15;

class Word extends Documento {
    @Override
    public void imprimir(){
        System.out.println("O arquivo Word esta sendo impresso");
    }
}
