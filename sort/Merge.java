import java.util.*;
public class Merge{
  static Scanner sc = new Scanner(System.in);

/*  public static int [] merge (ArrayList<Integer> a,ArrayList<Integer> b){
    int []c = new int [a.size()+b.size()];
    int i= 0 ;   
    while (a.size()!=0 && b.size()!=0){
      int comparasion =a.get(0) - b.get(0);

      if (comparasion > 0){

	c[i] = b.get(0);
	b.remove(0);
	System.out.println("b");
      }
      else {
	System.out.println("a");
	c[i]=a.get(0);
	a.remove(0);
      }
      System.out.println("a"+a);
      System.out.println("b"+b);
      i++;
    }
    return c;
  }*/
  public static void mergeSort(int []a){
    if (a.length <2) return;
    int mid = a.length/2;
    int [] b =  new int [mid];
    int [] c = new int [a.length-mid];
    for (int i=0; i< mid ; i++){
      b[i] = a[i];
    }
    for (int i=mid; i< a.length ; i++){
      c[i-mid] = a[i];
    }
    mostrar(b);
    mostrar(c);
    mergeSort(b);
    mergeSort(c);
    
    mergeArreglo(a,b,c);

  }
  public static void mergeArreglo (int a[], int b[] , int c[]){
    System.out.println("len of a"+a.length);
    //este metodo solo modifica el arreglo a, donde estaran fusionados los arreglos b y c
    int i=0, j = 0, k= 0;
    while (i<b.length && j< c.length){
      if (b[i]<= c[j]){
	a[k++] = b[i++];
      }else {
	a[k++] = c[j++];
      }
      System.out.println(i+","+j);
      System.out.println(a.length+""+b.length);
      mostrar(a);

    }
    //poner encima todo
    while (i < b.length){
      a[k++]=b[i++];
    }
    while (j < c.length){
      a[k++]= c[j++];
    }

    //
  }
  public static void mostrar(int a[]){
    for (int i =0; i<a.length; i++){
      System.out.print(a[i]+",");
    }
    System.out.println();
  }

  public static void main (String []arg){
    System.out.println("ingrese primer lista");
    /*ArrayList<Integer> lista1 = new ArrayList<Integer>();
      ArrayList<Integer> lista2 = new ArrayList<Integer>();*/
    System.out.println("ingrese la/las listas");

   /* int [] lista1 = new int [sc.nextInt()];
    int [] lista2 = new int [sc.nextInt()];
    int [] listaNueva = new int [lista1.length+lista2.length];

    for (int i=0 ; i<lista1.length; i++){
      lista1 [i]=sc.nextInt();
    }
    System.out.println("otra lista");
    for (int j=0 ; j<lista2.length; j++){
      lista2 [j]=sc.nextInt();
    }
    System.out.println("lista separadas");
    mostrar(lista1);
    mostrar(lista2);
    System.out.println("");
    System.out.println("ordenar");
    mergeArreglo(listaNueva,lista1,lista2);
    mostrar(listaNueva);*/
    int  [] listaDesordenada = new int [10];
    for (int j=0 ; j<listaDesordenada.length; j++){
      listaDesordenada [j]=sc.nextInt();
    }
    mostrar(listaDesordenada);
    mergeSort(listaDesordenada);
    mostrar(listaDesordenada);


  }
}
