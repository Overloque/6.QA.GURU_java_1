package guru.qa;

import java.util.Queue;

public class QueuePart {
    final int varA;
    final int varB;
    final int varC;

    Queue<QueuePart> queuePartArray;
    public QueuePart(int varA, int varB, int varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public void printQueue() {
        System.out.println(this);
    }

    public void addQueueItem(Queue<QueuePart> queuePartArray) {
        this.queuePartArray = queuePartArray;
        int i = 0;

        do {
            System.out.println("New Queue item:");
            this.queuePartArray.element().printQueue();
        } while (i < this.queuePartArray.size());
    }

    @Override
    public String toString() {
        return "QueuePart{" +
                "varA=" + varA +
                ", varB=" + varB +
                ", varC=" + varC +
                ", queuePartArray=" + queuePartArray +
                '}';
    }
}
