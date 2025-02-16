/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Musica com os métodos play(), pause(), stop(), e implemente-a nas classes Spotify e Deezer.
CLASSE: Spotify
 */
package Exe60;

 class Spotify implements IMusica {
    @Override 
    public void play(){
        System.out.println("SPORTIFY: Aperte o PLAY para musica tocar");
    }
    public void stop(){
        System.out.println("SPORTIFY: Aperte STOP para musica parar");
    }
}
