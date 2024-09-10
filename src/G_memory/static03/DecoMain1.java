package G_memory.static03;

public class DecoMain1 {

    public static void main(String[] args) {

        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1(); // C+alt+v 단축키 활용
        String deco = utils.deco(s);

        System.out.println("before:" + s);
        System.out.println("after:" + deco);
    }
}
