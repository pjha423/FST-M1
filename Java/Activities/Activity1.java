package activities;

public class Activity1 {
    public static void main(String [] args){
        Car tata = new Car();

        tata.make = 2014;
        tata.color = "black";
        tata.transmission= "manual";

        tata.displayCharacteristics();
        tata.accelerate();
        tata.brake();
    }
}
