package temperaturecontroller;

import java.util.Timer;
import java.util.TimerTask;
import variables.variables;

public class ThreadingExample {
    
     public static void main(String args[]) throws InterruptedException{
        ui.GUI();
        TimerTask timerTask = new zone1();
        TimerTask timer2Task = new zone2();
        TimerTask timer3Task = new zone3();
        TimerTask scantask = new scan();
        TimerTask multiplexertask = new multiplexer();
        //running timer task as daemon thread
        Timer zone1 = new Timer(true);
        Timer zone2 = new Timer(true);
        Timer zone3 = new Timer(true);
        Timer scan = new Timer(true);
        Timer multiplexer = new Timer(true);


        zone1.scheduleAtFixedRate(timerTask, 20, 1000);
        zone2.scheduleAtFixedRate(timer2Task, 20, 1000);
        zone3.scheduleAtFixedRate(timer3Task, 20, 1000);
        scan.scheduleAtFixedRate(scantask, 30, 250);
        multiplexer.scheduleAtFixedRate(multiplexertask, 0, 250);

        while(true)
        {          
        }
    }
}

class zone1 extends TimerTask {

    @Override
    public void run() {
       // System.out.println("Timer2");
             if(variables.multiplex == 1)
        completeTask();
    }

    private void completeTask() {
            //assuming it takes 20 secs to complete the task
            
            System.out.println(1);
            
    }
}

class zone2 extends TimerTask {

    @Override
    public void run() {
       // System.out.println("Timer2");
             if(variables.multiplex == 2)
        completeTask();
    }

    private void completeTask() {
            //assuming it takes 20 secs to complete the task
            
            System.out.println(2);
            
    }
}

class zone3 extends TimerTask {

    @Override
    public void run() {
       // System.out.println("Timer2");
       if(variables.multiplex == 3)

        completeTask();
    }

    private void completeTask() {
            //assuming it takes 20 secs to complete the task

            System.out.println(3);
            
    }
}

class multiplexer extends TimerTask {

    @Override
    public void run() {
       // System.out.println("Timer2");
        completeTask();
    }

    private void completeTask() {
            //assuming it takes 20 secs to complete the task
            //read gui and temperature
           // System.out.println("scan");
            if(variables.multiplex < 3)
                variables.multiplex++;
            else if(variables.multiplex == 3)
                variables.multiplex = 1;
            
            
    }
}

