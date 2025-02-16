/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Transmissivel com os métodos iniciarTransmissao() e finalizarTransmissao(), e implemente-a nas classes Youtube e Twitch.
CLASSE: Youtube
 */
package Exe56;

 class Youtube implements ITransmissivel {
    @Override
    public void iniciarTransmissao(){
        System.out.println("Transmissao no Youtube iniciada  / LIVE ON");
    }
    public void finalizarTransmissao(){
        System.out.println("Transmissao no Youtube finalizada / LIVE OUT");
    }
}
