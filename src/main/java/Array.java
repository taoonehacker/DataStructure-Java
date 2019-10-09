import java.security.PublicKey;
import java.util.Calendar;

public class Array {
  private int[] data;
  private int size;

  public Array(int capacity){
    data = new int[capacity];
    this.size=0;
  }

  public Array(){
    this(10);
  }

  public int getCapacity(){
    return data.length;
  }
  public int getSize(){
    return this.size;
  }

  public boolean isEmpty(){
    return  this.size==0;
  }

  public void addLast(int e){
    add(size,e);
  }

  public void addFirst(int e){
    add(0,e);
  }

  public void add(int index,int e){
    if(size==data.length)
      throw new IllegalArgumentException("Add failed. Array is full.");
    if(index<0||index>size)
      throw new IllegalArgumentException("Add failed. Require index >=0 and index <= size.");
    for (int i = size-1; i >=index; i--)
      data[i+1]=data[i];
    data[index]=e;
    size++;
  }

  public int get(int index){
    if(index<0||index>size)
      throw new IllegalArgumentException("Get failed. Index is illegal.");
    return this.data[index];
  }

  public void set(int index,int e){
    if(index<0|| index>size)
      throw new IllegalArgumentException("Set failed. Index is illegal.");
    data[index]=e;
  }

  public String toString(){
    StringBuffer sb = new StringBuffer();
    sb.append(String.format("Array:size=%d,capacity=%d\n",size, getCapacity()));
    sb.append("[");
    for (int i = 0; i < size; i++) {
      sb.append(data[i]);
      if(i!=size-1)
        sb.append(",");
    }
    sb.append("]");
    return sb.toString();
  }



}
