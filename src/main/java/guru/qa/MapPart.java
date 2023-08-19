package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class MapPart {
    final int varA;
    final int varB;
    final int varC;

    Map<Integer, MapPart> mapPartArray = new HashMap<>();
    public MapPart(int varA, int varB, int varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public void printMap() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MapPart{" +
                "varA=" + varA +
                ", varB=" + varB +
                ", varC=" + varC +
                '}';
    }
}
