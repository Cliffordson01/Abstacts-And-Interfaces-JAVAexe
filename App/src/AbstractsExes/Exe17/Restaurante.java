/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Restaurante que contenha pratos (Prato), e implemente pratos específicos (Pizza, Sushi).
CLASSE: Restaurante
 */
package Exe17;

class Restaurante extends Prato {
    @Override
    public void prato(){
        System.out.println("Pizza, Sushi");
    }
}
