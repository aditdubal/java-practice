public class demo{
    public static void main(String[] args){
        car car1 = new car("bmw", "red");

 
        car1.drive();
        car2.drive();

        car1.info();
        car2.info();

    }
}


class car{
    String brand;
    String color;
    int price;

    car(String b, String c){
        this.brand = b;
        this.color = c;
    }

    void drive(){
        System.out.println(brand + " of " + color + " color is Driving");
    }

    void info(){
        System.out.println("brand : " + brand);
        System.out.println("color : " + color);
        System.out.println();

 
    }
}