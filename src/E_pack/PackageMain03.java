package E_pack;

import E_pack.A.User;

public class PackageMain03 {

    public static void main(String[] args) {
        // 패키지 A와 B 클래스 이름이 같음. 자주사용하면 임폴트를 해준다.
        User user = new User();
        E_pack.B.User userB = new E_pack.B.User();
    }
}
