package exe1;

public class Caixa<T> {
  private T wrappedObject;


  public T getWrappedObject() {
    return wrappedObject;
  }
  public void setWrappedObject(T wrappedObject) {
    this.wrappedObject = wrappedObject;
  }

  public boolean isEmpty() {
    return wrappedObject == null;
  }

}
