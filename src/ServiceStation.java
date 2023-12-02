public class ServiceStation {


    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        bicycle.updateTyre(bicycle);
        System.out.println();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        truck.updateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        car.updateTyre(car);
        car.checkEngine();
        System.out.println();
    }
}
