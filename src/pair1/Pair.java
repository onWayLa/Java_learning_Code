package pair1;

/**
 * @ClassName:Pair
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/24 0024
 * @Version 1.0
 */
public class Pair <T>{
    private T first;
    private T second;

    public Pair(){first = null; second = null;}
    public Pair(T first, T second){ this.first = first; this.second = second; }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
