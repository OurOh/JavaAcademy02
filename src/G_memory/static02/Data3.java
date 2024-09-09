package G_memory.static02;

public class Data3 {
    // 둘 다 멤버변수(필드). 하지만 더 디테일하게 가면 둘 로 나뉜다.
    public String name;         // 인스턴스 변수(힙영역)
    public static int count;    //static을 붙이면 `static` 변수, 정적 변수 또는 클래스 변수라 한다.
                                //static이 붙은 멤버 변수는 메서드 영역에서 관리한다. 힙영역(인스턴스영역) X
    public Data3(String name) {
        this.name = name;
        count++;                // = Data3.count++; 자신 클래스 안이니까 Data3 생략가능
    }
}
