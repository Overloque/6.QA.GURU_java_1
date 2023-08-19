package guru.qa;

import java.util.List;
import java.util.Set;

public class SetPart {
    final int varA;
    final int varB;
    final int varC;

    Set<SetPart> setPartArray;
    public SetPart(int varA, int varB, int varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public void printSet() {
        System.out.println(this);
    }

    public void printSetItem(Set<SetPart> setPartArray) {
        this.setPartArray = setPartArray;

        for (SetPart element : this.setPartArray) {
            System.out.println("New Set item:");
            element.printSet();
        }
    }

    @Override
    public String toString() {
        return "SetPart{" +
                "varA=" + varA +
                ", varB=" + varB +
                ", varC=" + varC +
                ", setPartArray=" + setPartArray +
                '}';
    }
}
