/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface FormaGeometrica com o método calcularArea() e implemente-a nas classes Quadrado e Circulo.
CLASSE: Main
 */
package Exe34;

public class Main {
    public static void main(String[] args) {
        IFormaGeometrica quadrado = new Quadrado();
        IFormaGeometrica circulo = new Circulo();

        quadrado.calcularArea();
        circulo.calcularArea();
    }
    
}
