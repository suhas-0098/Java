package constructors;

public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand,String color,int speed){
        this.brand = brand;
        this.color = color;
        this.speed=speed;
    }

    void drive(){
        System.out.println(this.brand +" " + this.color + " is driving at speed " + this.speed);
    }

    void display(){
        System.out.println(this.brand+" "+this.color+" "+this.speed);
    }

}
