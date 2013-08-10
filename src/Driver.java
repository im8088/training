/**
 * Created by Administrator on 13-8-10.
 */
public class Driver {
    Vehicle vehicle;
    String name;
    void drive(){
        System.out.print(name + " drive "+vehicle.color+" "+vehicle.name+ " ");
        vehicle.run();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "ferrari";
        car.color = "red";

        Ship ship = new Ship();
        ship.name = "sailing boat";
        ship.color = "black";

        Driver li = new Driver();
        li.name="Techer Li";
//        li.vehicle = car;
        li.vehicle = ship;
        li.drive();
    }
}
