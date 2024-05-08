public class Truck extends Vehicle implements tyreService, engineService {

    @Override
    public void updateTyre() {
        System.out.println("Меняем грузовую покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем грузовой двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}