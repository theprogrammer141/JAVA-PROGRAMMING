import java.util.ArrayList;
import java.util.Arrays;

public class Country implements Stats{
    String name;
    int[] provincesAreas = new int[2];
    ArrayList<Integer> statesAreas = new ArrayList<>();

    public Country(String name, int[] provincesAreas, ArrayList<Integer> statesAreas) {
        this.name = name;
        this.provincesAreas = provincesAreas;
        this.statesAreas = statesAreas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getProvincesAreas() {
        return provincesAreas;
    }

    public void setProvincesAreas(int[] provincesAreas) {
        this.provincesAreas = provincesAreas;
    }

    public ArrayList<Integer> getStatesAreas() {
        return statesAreas;
    }

    public void setStatesAreas(ArrayList<Integer> statesAreas) {
        this.statesAreas = statesAreas;
    }

    @Override
    public double computeArea() {
        double totalArea = 0;
        for(int area : provincesAreas)
        {
            totalArea += area;
        }
        for(Integer area : statesAreas)
        {
            totalArea += area;
        }
        return totalArea;
    }

    @Override
    public void reset() {
        Arrays.fill(provincesAreas, 0);
        statesAreas.clear();
    }
}
