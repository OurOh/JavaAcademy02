package J_poly.ex5;

public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음모~");
    }

    @Override
    public void move() {
        System.out.println("소가 지나갑니다.");
    }
}
