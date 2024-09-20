package J_poly.ex5;

import J_poly.ex3.AbstractAnimal;

public class AnimalMain {

    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

        private static void soundAnimal(InterfaceAnimal animal) {
            //AbstractAnimal: 매개변수의 타입  animal: 매개변수의 이름 / AbstractAnimal animal을 통째로 매개변수라 봐도 된다.
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

