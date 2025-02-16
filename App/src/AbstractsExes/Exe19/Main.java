/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  .Crie uma classe Forma3D que tenha calcularVolume(), e implemente Esfera e Cubo.
CLASSE: Main
 */
package Exe19;

public class Main {
    public static void main(String[] args) {
        Cubo cubo = new Cubo();
        Esfera esfera = new Esfera();

        cubo.calcularVolume();
        esfera.calcularVolume();
    }
}
