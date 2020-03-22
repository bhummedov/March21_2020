package March21_2020;

public class BikeTest {
    public static void main(String[] args) {
        Bicycle myObj = new Bicycle(30, 10);
        myObj.slowDown();
        RoadBike myObj2 = new RoadBike(29, 16, 40, 30);
        myObj2.speeUp();
    }
}
