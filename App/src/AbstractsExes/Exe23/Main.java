/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Dispositivo com um método conectarInternet(), e implemente Smartphone e SmartTV.
CLASSE: Main
 */
package Exe23;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        SmartTv smartTv = new SmartTv();

        smartPhone.conectarInternet();
        smartTv.conectarInternet();
    }
}
