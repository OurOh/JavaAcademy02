package J_poly.ex3;

import J_poly.ex2.Animal;

public class AbstractMain {

    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAniamal animal = new AbstractAnimal(); 불가.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        cat.sound();
        dog.sound();
        caw.sound();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

        private static void soundAnimal(AbstractAnimal animal) {
            //AbstractAnimal: 매개변수의 타입  animal: 매개변수의 이름 / AbstractAnimal animal을 통째로 매개변수라 봐도 된다.
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
    }
}
