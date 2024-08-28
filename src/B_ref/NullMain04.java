package B_ref;

public class NullMain04 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        //문재해결하기.
        bigData.data = new Data();

        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.count=" + bigData.data);
        //  NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
