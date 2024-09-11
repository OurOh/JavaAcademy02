package G_memory.ex;

public class Car {
    //메서드 영역과 힙(인스턴스) 영역을 생각해보자.
    private String name;
    private static int totalCars;

    public Car(String name) {
        System.out.println("차량 구입, 이름:" + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
