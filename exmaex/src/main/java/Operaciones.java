/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Operaciones {
    
    public static <T extends Comparable<T>> T menor(T[]arre){
        T min= arre [0];
        for (int i = 0; i < arre.length; i++) {
            if (arre[i]!=null){
                if (min.compareTo(arre[i])>0){
                    min= arre[i];
                }
            }
        }   
        return min;
    }
    
}
