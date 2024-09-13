package I_extend.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogencar = new HydrogenCar();
        hydrogencar.move();
        hydrogencar.fillHydrogen();
        hydrogencar.openDoor();
    }
}
