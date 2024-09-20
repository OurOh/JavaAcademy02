package J_poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("나용~");
    }

    @Override
    public void move() {
        System.out.println("고양이가 지나갑니다.");
    }
}
