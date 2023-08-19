package guru.qa;

import java.util.List;

public class ListPart {
    final int varA;
    final int varB;
    final int varC;
    List<ListPart> listPartArray;

    public ListPart(int varA, int varB, int varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public void printList() {
        System.out.println(this);
    }

    public static void printListItem(List<ListPart> listPartArray) {

        for (ListPart listPart : listPartArray) {
            System.out.println("New item: ");
            listPart.printList();
        }
    }

    public void findElement (List<ListPart> listPartArray, ListPart item) {
        this.listPartArray = listPartArray;

        for (ListPart listPart : listPartArray) {
            if (listPart == item) {
                System.out.println("Found item: " + item);
                break;
            }
        }
    }

    public static void addElement (List<ListPart> listPartArray, ListPart item) {
        listPartArray.add(item);
    }

    @Override
    public String toString() {
        return "ListPart{" +
                "varA=" + varA +
                ", varB=" + varB +
                ", varC=" + varC +
                '}';
    }


}
