/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Sensores com o método medirTemperatura(), implemente-a nas classes SensorDeTemperatura e SensorDePressao.
CLASSE: SensorDeTemperatura
 */
package Exe44;

 class SensorDeTemperatura implements ISensores {
    @Override
    public void medirTemperatura(){
        System.out.println("Medindo a temperatura");
    }
}
