package VehicleMain;

public class Vehicle {
    private String color;
    protected int maxSpeed;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void print(){
        System.out.println(color + " " + maxSpeed);
    }
}
