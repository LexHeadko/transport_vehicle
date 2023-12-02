public class ServiceStation {


    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        bicycle.checkTyre();
        System.out.println();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        truck.checkTyre();
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        car.checkTyre();
        car.checkEngine();
        System.out.println();
    }
}
