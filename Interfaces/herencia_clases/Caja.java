public class Caja<T>{
  protected T dato;
  public T get(){
    return this.dato;
  }
  public void set(T x){
    this.dato = x;
  }
  public static <S> void ponerEnCaja(S ele, Caja<S> caja ){
    caja.set(ele);
  }

}
