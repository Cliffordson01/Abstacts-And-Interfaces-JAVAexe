/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Dispositivo com um método conectarInternet(), e implemente Smartphone e SmartTV.
CLASSE: SmartPhone
 */
package Exe23;

 class SmartPhone extends Dispositivo {
    @Override
    public void conectarInternet(){
        System.out.println("O SmartPhone esta conectado a internet");
    }
}
