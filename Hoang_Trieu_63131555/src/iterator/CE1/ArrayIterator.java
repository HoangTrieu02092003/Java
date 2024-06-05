package iterator.CE1;

public class ArrayIterator implements Iterator{
    ArrayCollectionCE1 collection;
    int index = 0;
    protected ArrayIterator(ArrayCollectionCE1 array){
        this.collection = array;
    }
    @Override
    public Object first() {
        if (collection.count() > 0) {
            index = 0;
            return collection.get(index);
        }
        return null;

    }

    @Override
    public Object next() {
        if(!isDone())
            return collection.get(index++);
        return null;
    }

    @Override
    public boolean isDone() {
        return (index == collection.count());
    }

    @Override
    public Object currentItem() {
        if(index >=0)
            return collection.get(index);
        return null;
    }
}
