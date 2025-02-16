/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface ControleRemoto com os métodos aumentarVolume() e diminuirVolume(), implemente-a na classe Televisao.
CLASSE: Televisao
 */
package Exe45;

 class Televisao implements IControleRemoto{
    @Override
    public void aumentarVolume(){
        System.out.println("Aumentando o volume");
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume");
    }
}
