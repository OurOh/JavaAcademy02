package F_access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
// 접근제어자가 default 이다. 다른 패키지는 접근 불가.
class DefaultClass1 {

}
class DefaultClass2 {

}
