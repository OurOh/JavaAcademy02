package J_poly.basic;


public class PolyMain {

        public static void main(String[] args) {
            //부모 변수가 부모 인스턴스 참조
            System.out.println("Parent -> Parent");
            Parent parent = new Parent();
            parent.parentMethod();

            //자식 변수가 자식 인스턴스 참조
            System.out.println("Child -> Child");
            Child child = new Child();
            child.parentMethod();
            child.childMethod();

            //부모 변수가 자식 인스턴스 참조(다형적 참조)
            System.out.println("Parent -> Child");
            Parent poly = new Child();   //poly라는 부모 타입의 변수가 자식 클래스 Child의 객체를 참조하고 있다는 뜻이다.
            poly.parentMethod();

            //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.
            //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
            //poly.childMethod(); 호출 불가.

        }
    }