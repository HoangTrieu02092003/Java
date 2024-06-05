package iterator.CE11;

public class ArrayIterator implements IteratorArray{
    ArrayCollection collection;

    int index = -1;

    protected ArrayIterator(ArrayCollection array) {
        this.collection = array;
    }

    @Override
    public Object First() {
        if (collection.count() > 0){
            index = 0;
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    public Object Next() {
        if (!isDone())
            return collection.getItem(++index);
        return null;
    }

    @Override
    public Object CurrentItem() {
        if (index >= 0)
            return collection.getItem(index);
        return null;
    }

    @Override
    public Boolean isDone() {
        return (index == collection.count() - 1);
    }
}
