package A_ClassAndData;

public class ClassStart03 {

    public static void main(String[] args) {

        Student student1;           // Student 클래스에서 따와서 student1이라는 객체(인스턴스) 생성.
        student1 = new Student();   //  클래스를 활용하면 int, String과 같은 타입을 만들어 낼 수 있다.
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 80;

        Student student2 = new Student(); //  new를 만들 때마다 객체를 보관하는 메모리(집 주소)가 생성된다.
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 90;

        System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "점수 : " + student1.grade);
        System.out.println("이름 : " + student2.name + "나이 : " + student2.age + "점수 : " + student2.grade);
    }
}
