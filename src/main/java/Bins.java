import java.util.HashMap;
import java.util.Set;

public class Bins {

    private HashMap<Integer, Integer> bins;

    public Bins(int start, int end) {
        bins = new HashMap<Integer, Integer>();
        makeBins(start, end);

    }


    private void makeBins(int start, int end) {
        for (Integer i = start; i < end + 1; i++) {
            bins.put(i, 0);
        }
    }

    public HashMap<Integer, Integer> getBins(){
        return bins;
    }

    public Integer getBins(int numBin) {
        return bins.get(numBin);
    }

    public void incrementBin(int numBin) {
        Integer oldNum = bins.get(numBin);
        bins.put(numBin, oldNum + 1);
    }

    public Integer total() {
        Integer total = 0;
        Set<Integer> binSet = bins.keySet();
        for (Integer bin : binSet) {
            total += bins.get(bin);
        }
        return total;
    }

    public float percentage(int num, float total) {
        return (float) getBins(num)/total;
    }

}
