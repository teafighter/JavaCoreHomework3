public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
//        car.modelName = "car1";
        car1.setModelName("car1");
//        car2.modelName = "car2";
        car2.setModelName("car2");
//        car.wheelsCount = 4;
        car1.setWheelsCount(4);
//        car2.wheelsCount = 4;
        car2.setWheelsCount(4);
//
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
//        truck.modelName = "truck1";
        truck1.setModelName("truck1");
//        truck2.modelName = "truck2";
        truck2.setModelName("truck2") ;
//        truck.wheelsCount = 6;
        truck1.setWheelsCount(6);
//        truck2.wheelsCount = 8;
        truck2.setWheelsCount(8);
//
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
//        bicycle.modelName = "bicycle1";
        bicycle1.setModelName("bicycle1");
//        bicycle2.modelName = "bicycle2";
        bicycle2.setModelName("bicycle2");
//        bicycle.wheelsCount = 2;
        bicycle1.setWheelsCount(2);
//        bicycle2.wheelsCount = 2;
        bicycle2.setWheelsCount(2);
//
        ServiceStation station = new ServiceStation();
        station.check(bicycle1);
        station.check(bicycle2);
        station.check(car1);
        station.check(car2);
        station.check(truck1);
        station.check(truck2);

    }
}