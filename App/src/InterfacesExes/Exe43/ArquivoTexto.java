/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Armazenavel com os métodos salvar() e carregar(), e implemente-a nas classes ArquivoTexto e BancoDeDados.
CLASSE: ArquivoTexto
 */
package Exe43;

 class ArquivoTexto implements IArmazenavel {
    @Override
    public void salvar(){
        System.out.println("Arquivo texto salvo");
    }

    public void carregar(){
        System.out.println("Arquivo texto carregado");
    }
}
