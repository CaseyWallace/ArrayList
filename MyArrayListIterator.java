import java.util.Iterator;

public class MyArrayListIterator<T> implements Iterator<T>{

  MyArrayList mal;
  int index = 0;

  public MyArrayListIterator(MyArrayList mal){
    this.mal = mal;
  }

  @Override
  public boolean hasNext() {
    return index < mal.size();
  }

  @Override
  public T next() {
    return (T) mal.get(index++);
  }
  
}