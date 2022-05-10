package activities;

interface BicycleParts{
    public int gears=0;
    public int currentSpeed=0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;

    Bicycle(int gears,int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed = currentSpeed-decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed = currentSpeed+increment;
        System.out.println("Current speed: " + currentSpeed);
    }
    public String bicycleDesc(){
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);

    }
}

class MountainBike extends Bicycle {
    int seatHeight;

    MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return super.bicycleDesc() + "\nSeat height is " + seatHeight;
    }
}
public class Activity7 {
        public static void main(String [] args){
            MountainBike mb = new MountainBike(4,3,20);
            System.out.println(mb.bicycleDesc());
            mb.speedUp(20);
            mb.applyBrake(10);
        }
}



