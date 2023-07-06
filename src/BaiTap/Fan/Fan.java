package BaiTap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(String color) {
        this.color = color;
    }

    public boolean check() {
        this.on = !this.on;
        return !on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void toStr() {
        if (on){
            System.out.println("speed");
            System.out.println(speed = FAST);
            System.out.println(color = "yellow");
            System.out.println(radius = 10);
            System.out.println("Fan is on");
        } if (!on){
            System.out.println("speed");
            System.out.println(speed = MEDIUM);
            System.out.println(color);
            System.out.println(radius);
            System.out.println("Fan is off");
        }
    }
}
