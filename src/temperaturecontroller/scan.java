/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturecontroller;

import java.util.TimerTask;

/**
 *
 * @author ajevi
 */
class scan extends TimerTask {

    @Override
    public void run() {
       // System.out.println("Timer2");
        completeTask();
    }

    private void completeTask() {
            //assuming it takes 20 secs to complete the task
            //read gui and temperature
            System.out.println("scan");
            
    }
}