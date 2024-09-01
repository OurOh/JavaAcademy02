package C_oop1;

public class ValueDataMain {
    public static void main(String[] args) {
    // 기존방식은 데이터가 있는 부분과 메서드가 분리되어있다.
    ValueData valueData =  new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.value);
    }

    //메서드 생성.
    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
