public class Bicycle extends Vehicle implements tyreService {

    @Override
    public void updateTyre() {
        System.out.println("Меняем велосипедную покрышку");
    }
}