/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public abstract class Figura implements Comparable<Figura> {
    private String nombre;
    
    abstract  public double area();
    

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    final public double compArea(Figura b){
        return area()-b.area();
    }
    public String toString(){
        return this.nombre + "area de "+ area();
    }
    

    @Override
    public int compareTo(Figura o) {
        if(compArea(o)<0)return -1;
        if(compArea(o)<0)return -1;
        return 0;
    }
    
}
