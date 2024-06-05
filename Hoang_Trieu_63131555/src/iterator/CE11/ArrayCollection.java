package iterator.CE11;

public class ArrayCollection extends CollectionArr {
    private int[] arr = {1, 2, 3, 4, 5, 6};

    public int getItem(int i){
        return arr[i];
    }

    public int count(){
        return arr.length;
    }

    @Override
    public IteratorArray createIterator() {
        return new ArrayIterator(this);
    }
}
