import org.junit.Test;

public class TArray<T> {
    private T[] data;
    private int size;

    public TArray(int capacity){
        data = (T[])new Object[capacity];
        size=0;
    }

    public TArray(){
        this(10);
    }

    public int getCapacity(){
        return data.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(int index,T e){

        if(index < 0|| index > size)
            throw new IllegalArgumentException("Add Failed. Required index >=0 and index <= size.");

        if(size==data.length)
            resize(data.length*2);

        for (int i = size-1; i >=index; i--)
            data[i+1]=data[i];
        data[index]=e;
        size++;
    }

    public void addFirst(T e){
        add(0,e);
    }

    public void addLast(T e){
        add(size,e);
    }

    public T get(int index){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Get Failed. Index is illegal.");
        return data[index];
    }

    public void set(int index,T e){
        if(index < 0 || index > size)
            throw  new IllegalArgumentException("Set Failed. Index is illegal.");
        data[index] =e;
    }

    public boolean contains(T e){
        for (int i = 0; i < size; i++) {
            if(data[i]==e)
                return true;
        }
        return false;
    }

    public int find(T e){
        for (int i = 0; i < size; i++) {
            if(data[i]==e)
                return i;
        }
        return -1;
    }

    public T remove(int index){
        if(index < 0 || index >size)
            throw new IllegalArgumentException("Remove Faield. Index is illega.");
        T ret = data[index];
        for (int i = index+1; i < size; i++) {
            data[i-1]=data[i];
        }
        size--;
        data[size]=null;

        if(size == data.length/2)
            resize(data.length/2);

        return ret;
    }

    public T removeFirst(){
        return remove(0);
    }

    public T removeLast(){
        return remove(size-1);
    }

    public void removeElement(T e){
        int index = find(e);
        if(index!=-1)
            remove(index);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size = %d, capacity = %d\n",size,data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if(i!=size-1)
                sb.append(",");
        }
        sb.append("]");
        return  sb.toString();
    }

    public void resize(int newCapacity){
        T[] newData = (T[])new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
