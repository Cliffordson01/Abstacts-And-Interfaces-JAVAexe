/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Crie uma classe abstrata FormaGeometrica com métodos abstratos calcularArea() e calcularPerimetro(). Crie Circulo e Retangulo.
CLASSE: Retangulo
 */

package Exe03;

class Retangulo extends FormaGeometrica {
    @Override
    public void calcularArea() {
        System.out.println("Área do retângulo: ");
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do retângulo: ");
    }
}