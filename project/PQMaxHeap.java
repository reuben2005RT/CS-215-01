package project;

public class PQMaxHeap {
    public static final int MAXSIZE = 1000;
    private Weapon[] HeapItems;
    private int heapSize;

    public PQMaxHeap() {
        heapSize = 0;
        HeapItems = new Weapon[MAXSIZE];
    }

    public boolean isFull() {
        return heapSize == MAXSIZE;
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public void makeEmpty() {
        heapSize = 0;
    }

    // Compare two weapons by fireRate
    private boolean isGreater(Weapon a, Weapon b) {
        return a.fireRate > b.fireRate;
    }

    

    private void reheapDown(int top, int bottom) {
        int maxChild = top * 2 + 1;

        if (maxChild > bottom)
            return;

        if (maxChild + 1 <= bottom && isGreater(HeapItems[maxChild + 1], HeapItems[maxChild])) {
            maxChild++;
        }

        if (isGreater(HeapItems[maxChild], HeapItems[top])) {
            Weapon temp = HeapItems[maxChild];
            HeapItems[maxChild] = HeapItems[top];
            HeapItems[top] = temp;

            reheapDown(maxChild, bottom);
        }
    }
    private void reheapUp(int top, int bottom) {
        if (bottom > top) {
            int parent = (bottom - 1) / 2;

            if (isGreater(HeapItems[bottom], HeapItems[parent])) {
                Weapon temp = HeapItems[parent];
                HeapItems[parent] = HeapItems[bottom];
                HeapItems[bottom] = temp;

                reheapUp(top, parent);
            }
        }
    }

    public Weapon dequeue() throws Exception {
        if (heapSize == 0)
            throw new Exception("Heap Underflow");

        Weapon retval = HeapItems[0];
        HeapItems[0] = HeapItems[heapSize - 1];
        heapSize--;

        reheapDown(0, heapSize - 1);
        return retval;
    }

    public void enqueue(Weapon w) throws Exception {
        if (heapSize == MAXSIZE)
            throw new Exception("Heap Overflow");
        HeapItems[heapSize] = w;
        heapSize++;

        reheapUp(0, heapSize - 1);
    }
}


