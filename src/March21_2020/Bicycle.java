package March21_2020;

public class Bicycle {
    protected int gear;
    protected int speed;

    Bicycle(){
        String gear= "BMW";
        int speed = 6;
    }
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
}

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void speeUp(){
       this.speed++;
    }
    public void slowDown(){
        this.speed--;

    }
}

