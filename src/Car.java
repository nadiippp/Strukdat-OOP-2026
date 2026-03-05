public class Car {
    private String brand;
    private String color;
    private String type;
    private int speed;

public Car(){
}

public Car(String brand, String color, String type, int speed){
    this.brand = brand;
    this.color = color;
    this.type = type;
    this.speed = speed;
}

public void accelerate (int speedIncrease){
}

public String getBrand(){
    return brand;
}

public int getSpeed(){
    return speed;
}
}

