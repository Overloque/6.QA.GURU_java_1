package guru.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MainOOP {
    public static void main(String[] args) {

        ListPart listArray1 = new ListPart(1,2,3);
        ListPart listArray2 = new ListPart(3,4,5);
        ListPart listArray3 = new ListPart(6,7,8);
        ListPart listArray4 = new ListPart(55,55,55);
        ListPart listArray5 = new ListPart(55,55,56);

        QueuePart queueArray = new QueuePart(1, 2, 3);

        SetPart setArray1 = new SetPart(1, 2, 3);
        SetPart setArray2 = new SetPart(3, 4, 5);
        SetPart setArray3 = new SetPart(6, 7, 8);

        //LIST

        List<ListPart> newList = new ArrayList<>(List.of(listArray1, listArray2));
        listArray3.printList();
        ListPart.printListItem(newList);

        listArray1.findElement(newList, listArray2);
        ListPart.addElement(newList, listArray5);
        ListPart.addElement(newList, listArray4);

        ListPart.printListItem(newList);


    }
}
