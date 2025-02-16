/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe RedeSocial com métodos postar() e curtir(), e implemente Facebook e Twitter.
CLASSE: Facebook
 */

package Exe21;

 class Facebook extends RedeSocial {
    @Override
    public void postar(){
        System.out.println("Postagem realizado com sucesso");
    }
    public void curtir(){
        System.out.println("A sua postagem teve 2 mil curtidas");
    }
}
