/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Container <E>{
    private E[]arr;
    private int count;
    
    public Container(int n){
        this.arr= (E[]) new Object[n];
        this.count= 0;
    }
    public void add(E item){
        if (this.count < this.arr.length){
            this.arr[count++]=item;
        }
        else{
            System.out.println("lleno");
        }
    }
    public String toString(){
        String str ="";
        for (E e : this.arr) {
            if (e !=null) {
                str += e+",";
            }
            
        }
        return str;
    }
    
}
