package F_access.ex;

public class CounterMain {
    public static void main(String[] args) {
        //이 클래스는 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공합니다.
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
