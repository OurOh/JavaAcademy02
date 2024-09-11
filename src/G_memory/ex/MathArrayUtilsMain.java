package G_memory.ex;

// ALT + Enter로 import 가능.
public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum = " + MathArrayUtils.sum(values));
        System.out.println("average = " + MathArrayUtils.average(values));
        System.out.println("min = " + MathArrayUtils.min(values));
        System.out.println("max = " + MathArrayUtils.max(values));

    }
}
//실행 결과
//sum=15
//average=3.0
//min=1
//max=5