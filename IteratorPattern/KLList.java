package IteratorPattern;

public class KLList<T> implements Collection<T> {
    private T[] elements;
    public KLList(T[] e){
        this.elements=e;
    }
    public Iterator<T> iterator(){
        return new KLIterator<T>(elements);
    }
}
