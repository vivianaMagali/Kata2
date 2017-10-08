import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[]data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer>histogram=new HashMap<>();
        for (int value: data) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        }
        return histogram;
    }
}
