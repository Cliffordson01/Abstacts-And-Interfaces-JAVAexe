/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Armazenavel com os métodos salvar() e carregar(), e implemente-a nas classes ArquivoTexto e BancoDeDados.
CLASSE: BancoDeDados
 */
package Exe43;

 class BancoDeDados implements IArmazenavel {
    @Override
    public void salvar(){
        System.out.println(" Banco de dado salvo");
    }

    public void carregar(){
        System.out.println(" Banco de dado carregado");
    }
}
