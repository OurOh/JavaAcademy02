package A_classanddata;

public class ClassStart05 {

    public static void main(String[] args) {
        //변수에는 참조(주소)값만 복사해서 알려주는 것이다.
        //student1은 Student클래스의 객체(인스턴스)이자 변수이다.
        Student student1 = new Student();
        student1.age = 16;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 90;

        Student [] students = {student1, student2};
        // for 1
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + "나이 : " + students[i].age + "점수 : " + students[i].grade);
        }
        // for 2
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "점수 : " + s.grade);
        }
        // for 3.iter(단축키)
        for (Student s : students) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "점수 : " + s.grade);
            // '변수 s'가 students 배열을 참조하여 돈다.
        }


    }
}