public class Car extends Vehicle implements tyreService, engineService {

    @Override
    public void updateTyre() {
        System.out.println("Меняем легковую покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем легковой двигатель");
    }
}