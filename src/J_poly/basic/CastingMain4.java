package J_poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        // 다운 캐스팅
        Parent parent1 = new Child();       // new Child: 실제로 Child 객체를 메모리에 생성.
        Child child1 = (Child) parent1;
        child1.childMethod();
        parent1.parentMethod();

        Parent parent2 = new Parent();
        // new Parent: 실제로 Parent 객체를 메모리에 생성. Parent 인스턴스는 있지만 Child 인스턴스는 없다.
        // Parent parent2는 참조 변수이고, new Parent()는 실제 객체를 생성

        // Child child2 = (Child) parent2;     //런타임 오류 - ClassCastException, Child 인스턴스가 없다.
        // child2.childMethod();
        parent2.parentMethod();
    }
}
