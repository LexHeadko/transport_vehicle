public class Main { 
    public static void main(String[] args) {
        Car car = new Car("Audi", 4);
        Car car2 = new Car("BMW", 4);

        Truck truck = new Truck("KamAZ", 10);
        Truck truck2 = new Truck("MAN", 8);

        Bicycle bicycle = new Bicycle("КАМА",2);
        Bicycle bicycle2 = new Bicycle("Урал", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
        serviceStation.check(car);
        serviceStation.check(car2);
        serviceStation.check(truck);
        serviceStation.check(truck2);
    }
}