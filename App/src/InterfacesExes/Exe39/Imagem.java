/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Imprimivel com o método imprimir(), implemente-a nas classes Documento e Imagem.
CLASSE: Imagem 
 */
package Exe39;

 class Imagem implements IImprimivel{
    @Override
    public void imprimir(){
        System.out.println("A imagem esta sendo impresso");
    }
}
