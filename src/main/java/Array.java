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

}
