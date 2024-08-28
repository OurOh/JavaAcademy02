package B_ref;

public class Method02 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 17, 80);

        printStudent(student1);
        printStudent(student2);
    }

    //메서드 생성
    static Student createStudent(String name, int age, int grade){
        Student student = new Student(); // student 변수 선언
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 다 돌고 참조형인 student 반환
    }
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 점수: " + student.grade);

    }
}
