public class BoxG<T>{
  private T dato;
  public T get(){
    return this.dato;
  }
  public void set(T x){
    this.dato = x;
  }
  public static <S> void ponerEnCaja(S ele, BoxG<S> caja ){
    caja.set(ele);
  }

}
