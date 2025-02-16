/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Transporte que tenha um método abstrato velocidadeMaxima(), e implemente Moto e Caminhão.
CLASSE: Moto
 */
package Exe14;

class Moto extends Transporte {
    @Override
    public void velocidadeMaxima(){
        System.out.println(" 120 KM");
    }
}
