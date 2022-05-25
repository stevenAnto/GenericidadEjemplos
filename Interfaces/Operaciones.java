public class Operaciones{
  //metodo generico

  public static <T extends Comparable<T>> T menor(T[] arre){
    T eleMin = arre[0];
    for (int i=1 ; i< arre.length;i++){
      if(arre[i]!= null){
	if (eleMin.compareTo(arre[i])>0){
	  eleMin = arre[i];
	}
      }
    }
    return eleMin;
  }
  public static <T> void mostrar( T[]arr){
    for (int i =0; i< arr.length; i++){
      System.out.print(arr[i]+",");
    }
    System.out.println("");
  }
}
