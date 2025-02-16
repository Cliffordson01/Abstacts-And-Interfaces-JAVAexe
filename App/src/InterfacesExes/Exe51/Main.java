/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Conversor que converte Celsius para Fahrenheit e implemente-a na classe Temperatura
CLASSE: Main
 */
package Exe51;

public class Main {
    public static void main(String[] args) {
        IConversor temperatura = new Temperatura();
        
        temperatura.Celsius();
        temperatura.Fahrenheit();
    }
}
