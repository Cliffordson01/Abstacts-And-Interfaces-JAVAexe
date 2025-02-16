/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Conversor que converte Celsius para Fahrenheit e implemente-a na classe Temperatura
CLASSE: Temperatura
 */
package Exe51;

 class Temperatura implements IConversor{
    @Override
    public void Celsius(){
        System.out.println("30 grau celcius");
    }
    public void Fahrenheit(){
        System.out.println("É 86 grau fahrenheit");
    }
}
