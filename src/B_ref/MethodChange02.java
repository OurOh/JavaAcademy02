package B_ref;

public class MethodChange02 {

    public static void main(String[] args) {
        //참조형
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        changePrimitive(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    public static void changePrimitive(Data dataX) {
        dataX.value = 20;
    }
}
