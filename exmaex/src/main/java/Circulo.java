/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Circulo extends Figura{
    static final private double PI = 3.1415926;
    
    private double radio;
    
    public Circulo(double r){
        super("circulo");
        this.radio=r;
    }
    public double area(){
        return PI*Math.pow(this.radio,2);
    }
}
