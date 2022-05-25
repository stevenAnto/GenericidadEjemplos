public abstract class Figura implements Comparable<Figura>{
  private String nombre;

  abstract public double area(); //metodo abstracto

  public Figura(String n){
    this.nombre = n;
  }

  final public double compArea(Figura b){
    return area()- b.area();
  }
  public int compareTo(Figura f){
    if (compArea(f)<0)return -1;
    if (compArea(f)>0)return 1;
    return 0;
  }
  final public String toString(){
    return this.nombre + " de area  "+area() ;
  }
  //alternativa para el nombre
  public void setNombre (String n){
    this.nombre = n;
  }
}
