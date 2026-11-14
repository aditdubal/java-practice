public class Car {

    public static final int TANK_CAPACITY = 40;

    String brand;
    String color;
    int fuelLevel;

    public void refuel(int litres) {
        if(litres <= 0){
            System.out.println("Invalide input");
            return;
        }

        fuelLevel += Math.min(litres,TANK_CAPACITY - fuelLevel);
        System.out.println("fuel levels : " + fuelLevel);

    }

    public boolean drive(int km) {
        if(km<=0){
            System.out.println("Invalid km");
            return false;
        }

        if(km/10 > fuelLevel){
            return false;
        }
        else{
            fuelLevel -= km/10;
            return true;
        }
    }

    public String describe() {
        return this.color + " " + this.brand + " | Fuel : "+ fuelLevel;
    }
}