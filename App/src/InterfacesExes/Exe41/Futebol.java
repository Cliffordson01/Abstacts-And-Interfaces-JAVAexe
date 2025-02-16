/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Jogavel com o método iniciarJogo(), e implemente-a nas classes Xadrez e Futebol.
CLASSE: Futebol
 */
package Exe41;

 class Futebol implements IJogavel{
    @Override 
    public void iniciarJogo(){
        System.out.println( "Iniciando o jogo de FUTEBOL");
    }
}
