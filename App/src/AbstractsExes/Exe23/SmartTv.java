/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Dispositivo com um método conectarInternet(), e implemente Smartphone e SmartTV.
CLASSE: SmartTv
 */
package Exe23;

 class SmartTv extends Dispositivo {
    @Override
    public void conectarInternet(){
        System.out.println("O SmartTv esta conectado a internet");
    }
}
