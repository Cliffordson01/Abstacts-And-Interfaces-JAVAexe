/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Sensores com o método medirTemperatura(), implemente-a nas classes SensorDeTemperatura e SensorDePressao.
CLASSE: Main
 */
package Exe44;

public class Main {
    public static void main(String[] args) {
        ISensores sensorDeTemperatura = new SensorDeTemperatura();
        ISensores sensorDePressao = new SensorDePressao();

        sensorDeTemperatura.medirTemperatura();;
        sensorDePressao.medirTemperatura();
    }
}
