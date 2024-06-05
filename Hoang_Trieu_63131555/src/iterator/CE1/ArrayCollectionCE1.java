package iterator.CE1;

public abstract class ArrayCollectionCE1 extends CollectionCE1{
    private int[] array = {1,2,3,4,5,6,7,8,9,10};

    public int get(int index){
        return array[index];
    }

    public int count(){
        return array.length;
    }

    @Override
    public ArrayIterator createIterator() {
        return new ArrayIterator(this);
    }
}
