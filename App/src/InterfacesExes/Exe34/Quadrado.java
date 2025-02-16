/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface FormaGeometrica com o método calcularArea() e implemente-a nas classes Quadrado e Circulo.
CLASSE: Quadrado
 */
package Exe34;

 class Quadrado implements IFormaGeometrica {
    @Override
    public void calcularArea(){
        System.out.println("A area do quadrado calculada");
    }
}
