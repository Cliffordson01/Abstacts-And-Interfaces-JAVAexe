/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Imprimivel com o método imprimir(), implemente-a nas classes Documento e Imagem.
CLASSE: Documento
 */
package Exe39;

 class Documento implements IImprimivel {
    @Override
    public void imprimir(){
        System.out.println("O Documento esta sendo impresso");
    }
}
