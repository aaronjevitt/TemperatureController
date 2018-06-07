/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturecontroller;

/**
 *
 * @author ajevi
 */
public class Thermocouple {
    int temperature;
    int pin;
    
    Thermocouple(int temp,int pin)
    {
        this.temperature = temp;
        this.pin = pin;
    }
    
    public void readTemp()
    {
        System.out.println("do stuff alot");
    }
    
}
