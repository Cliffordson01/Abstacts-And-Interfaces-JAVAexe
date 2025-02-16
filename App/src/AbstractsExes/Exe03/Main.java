/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Crie uma classe abstrata FormaGeometrica com métodos abstratos calcularArea() e calcularPerimetro(). Crie Circulo e Retangulo.
CLASSE: Main
 */

package Exe03;


public class Main{
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        circulo.calcularArea();
        circulo.calcularPerimetro();

        retangulo.calcularArea();
        retangulo.calcularPerimetro();
}
}