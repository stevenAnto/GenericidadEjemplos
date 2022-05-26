/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Caja <T> {
    private T dato;
    private String color;
    public Caja(String col){
        super();
        this.color = col;
    }
    public T dame(){
        return this.dato;
    }
    public void pon(T x){
        this.dato =x;
    }
    
    //metodo generico
    public static <T extends Comparable<T>> void ponEncaja(T ele, Caja <T> caja){
        caja.pon(ele);
    }

    @Override
    public String toString() {
        return "Caja{" + "dato=" + dato + ", color=" + color + '}';
    }
    
}
