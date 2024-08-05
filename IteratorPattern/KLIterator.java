package IteratorPattern;

public class KLIterator<T> implements Iterator<T> {
    private T[] elements;
    private int index;
    public KLIterator(T[] e){
        this.elements=e;
    }

    public boolean hasNext(){
        return (index<elements.length);
    }
    public T next(){
        if(this.hasNext()) 
        return elements[index++];
        else
        return null;
    }
}
