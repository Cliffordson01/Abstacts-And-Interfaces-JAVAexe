/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Musica com os métodos play(), pause(), stop(), e implemente-a nas classes Spotify e Deezer.
CLASSE: Deezer
 */
package Exe60;

 class Deezer implements IMusica {
    @Override
    public void play(){
        System.out.println("DEEZER: Aperte o PLAY para musica tocar");
    }
    public void stop(){
        System.out.println("DEEZER: Aperte o STOP para musica parar");
    }
}
