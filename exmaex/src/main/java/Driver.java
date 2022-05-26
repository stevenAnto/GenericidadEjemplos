/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Driver {
    public static void main(String []a ){
        
        Caja<Integer> c = new Caja <Integer>("verde");
        Figura figuras []= new Figura[3];
        Circulo cir1 =  new Circulo(5);
        Rectangulo rec1 = new Rectangulo(2,5);
        Cuadrado cua1 = new Cuadrado(4);
        figuras[0] = cir1;
        figuras[1]=rec1;
        figuras[2] = cua1;
        
        Container<Caja<Integer>> conInt = new Container<Caja<Integer>>(8);
        Container <Caja<Figura>> conFig = new Container<Caja<Figura>>(3);
        
        conInt.add(crearCaja(10, "verde"));
        conInt.add(crearCaja(10, "azul"));
        conInt.add(crearCaja(5, "amarillo"));
        conInt.add(crearCaja(2, "pao"));
        conInt.add(crearCaja(1, "rosa"));
        conFig.add(crearCaja(cir1, "blanc"));
        conFig.add(crearCaja(rec1, "negro"));
        conFig.add(crearCaja(cua1, "purpura"));
        System.out.println(conInt);
        System.out.println(conFig);
        
        System.out.println(Operaciones.menor(figuras));
        Caja.ponEncaja(52, c);
        
        
    }
    public static <T> Caja <T> crearCaja(T item, String color){
            Caja<T> c = new Caja<T>(color);
            c.pon(item);
        return c;
        }
        
    
}
