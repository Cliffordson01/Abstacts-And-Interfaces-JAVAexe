/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Jogavel com o método iniciarJogo(), e implemente-a nas classes Xadrez e Futebol.
CLASSE: Xadrez
 */
package Exe41;

 class Xadrez implements IJogavel{
    @Override
    public void iniciarJogo(){
        System.out.println("Iniciando o jogo de XADREZ");
    }
}
