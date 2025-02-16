/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Imprimivel com o método imprimir(), implemente-a nas classes Documento e Imagem.
CLASSE: Main
 */
package Exe39;

public class Main {
    public static void main(String[] args) {
        IImprimivel documento = new Documento();
        IImprimivel imagem = new Imagem();

        documento.imprimir();
        imagem.imprimir();
    }
}
