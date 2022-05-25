public class Garage <V> {
  private int numPlazas;
  private ArrayList <V> plazas;

  public Garaje (int numPlazas){
    this.numPlazas = numPlazas;
    this.plazas = new ArrayList<V>(numPlazas);
  }
}
