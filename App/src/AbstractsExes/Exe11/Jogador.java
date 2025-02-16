
/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Jogador que extenda Personagem e adicione um método usarHabilidadeEspecial().
CLASSE: Jogador
 */
package Exe11;

 class Jogador extends Personagem{
    @Override
    public void usarHabilidadeEspecial(){
        System.out.println("O Jogador chutou de trivela em direcao do gol");
    }
}
