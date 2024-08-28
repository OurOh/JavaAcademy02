package B_ref;

public class Method01 {

    public static void main(String[] args) {

        Student student1 = new Student(); // student1은 Student 클래스의 인스턴스(객체)이다., x001주소
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); //x002주소
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }
    // 메서드 만들기
    static void initStudent(Student student, String name, int age, int grade) {
        // 전달한 학생 객체의 필드(속성)에 값을 설정한다.
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        //전달한 학생 객체의 필드 값을 읽어서 출력한다.
        // printStudent는 메서드이다. Student는 타입, student는 매개변수이다.
        // Student student = student1
        // Student student = student2 로 이해할 수 있다.
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 점수: " + student.grade);

    }
}
