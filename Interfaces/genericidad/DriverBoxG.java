public class DriverBoxG{
  public static void main(String []a){
    BoxG <Integer> box = new BoxG <Integer>();
    box.set(5);
    Integer n = box.get();
    System.out.println(n);
    BoxG <String> letra = new BoxG <String>();
    letra.set("Este es un texto;");
    System.out.println(""+letra.get());
    BoxG.ponerEnCaja(500,box);
    System.out.println(box.get());
  }
}
