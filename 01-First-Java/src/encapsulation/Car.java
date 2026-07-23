package encapsulation;

public class Car {
    String brand;
    String color;
    int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String color, int speed, String brand) {
        this.color = color;
        this.speed = speed;
        this.brand = brand;
    }


    void drive(){
        System.out.println(this.getBrand() +" " + this.getColor() + " is driving at speed " + this.getSpeed());
    }



}
