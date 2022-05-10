package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class Plane {
    private ArrayList<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passenger){
        passengers.add(passenger);
    }
    public Date takeOff(){
        lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land(){
        lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public ArrayList getPassesngers(){
        return passengers;
    }

}


public class Activity6 {
    public static void main(String [] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("name1");
        plane.onboard("name2");
        plane.onboard("name3");
        plane.onboard("name4");
        plane.onboard("name5");

        System.out.println("Last time toof off: "+plane.takeOff());
        System.out.println("Passengers list :"+plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landed at :"+plane.getLastTimeLanded());
        System.out.println("Passengers on the plane after landing :"+plane.getPassesngers());



    }

}
