package G_memory.static03;

public class DecoUtil2 {

    // static, 정적메서드가 된다.
    // 덕분에 객체 생성없이 메서드 사용 가능.
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
