/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Crie uma classe abstrata FormaGeometrica com métodos abstratos calcularArea() e calcularPerimetro(). Crie Circulo e Retangulo.
CLASSE: Circulo
 */

package Exe03;

class Circulo extends FormaGeometrica {
    @Override
    public void calcularArea() {
        System.out.println("Área do círculo: ");
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do círculo: ");
    }
 }
