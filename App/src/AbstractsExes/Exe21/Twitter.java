/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe RedeSocial com métodos postar() e curtir(), e implemente Facebook e Twitter.
CLASSE: Twitter
 */
package Exe21;

 class Twitter extends RedeSocial {
    @Override
    public void postar(){
        System.out.println("Falha na postagem, tente mais tarde");
    }
    public void curtir(){
        System.out.println("Nenhuma curtida");
    }
}
