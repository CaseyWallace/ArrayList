import java.util.Iterator;

public class MyArrayListIterator implements Iterator<String>{

  MyArrayList mal;
  int index = 0;

  public MyArrayListIterator(MyArrayList mal){
    this.mal = mal;
  }

  @Override
  public boolean hasNext() {
    return index < mal.size() - 1;
  }

  @Override
  public String next() {
    return mal.get(index++).toString();
  }
  
}