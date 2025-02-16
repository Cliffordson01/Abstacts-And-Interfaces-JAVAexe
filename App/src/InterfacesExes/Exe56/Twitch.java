/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Transmissivel com os métodos iniciarTransmissao() e finalizarTransmissao(), e implemente-a nas classes Youtube e Twitch.
CLASSE: Twitch
 */
package Exe56;

 class Twitch implements ITransmissivel {
    @Override
    public void iniciarTransmissao(){
        System.out.println("Transmissao na Twitch iniciada / LIVE ON");
    }
    public void finalizarTransmissao(){
        System.out.println("Transmissao na Twitch finalizada / LIVE OUT");
    }
}
