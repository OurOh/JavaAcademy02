package A_ClassAndData;

public class ClassStart04 {

    public static void main(String[] args) {
        //변수에는 참조(주소)값만 복사해서 알려주는 것이다.
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 90;

        Student [] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "점수 : " + student1.grade);
        System.out.println("이름 : " + student2.name + "나이 : " + student2.age + "점수 : " + student2.grade);
    }
}