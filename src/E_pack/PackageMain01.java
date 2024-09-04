package E_pack;

public class PackageMain01 {

    public static void main(String[] args) {
        //같은 패키지
        Data data = new Data();
        //다른 패키지
        E_pack.A.User user = new  E_pack.A.User();
    }
}
