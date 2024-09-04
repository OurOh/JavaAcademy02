package E_pack;

// * 넣으면 패키지 안 클래스 모두 사용 가능.
import E_pack.A.User;

public class PackageMain02 {

    public static void main(String[] args) {
        //같은 패키지
        Data data = new Data();
        //다른 패키지- import활용
        User user = new User();

    }
}
