package G_memory.static01;

public class Data2 {
    public String name;

    //생성자
    public Data2(String name, Counter counter){
        this.name = name;
        counter.count++;
    }
}
