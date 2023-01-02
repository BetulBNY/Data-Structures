/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;
// PriorityQueue ve LinkedList kullanimi arasindaki farki gorucez.
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        
        Queue <Integer> priorex= new PriorityQueue<>();
        
        priorex.offer(87);
        priorex.offer(878);
        priorex.offer(5);
        priorex.offer(7);
        priorex.offer(1);
        priorex.offer(100);
        
        System.out.println("Butun prioex elemanlari:"+priorex);   
        //[1, 5, 87, 878, 7, 100]  ciktisini cikardi cunku
        //PriorityQueue alfabetik veya sayisal olarak siraliyor.
        
        //Simdi silinen ilk 3 elemani isteyelim
       int eleman1= priorex.poll();
       int eleman2= priorex.poll();
       int eleman3= priorex.poll();
        
       System.out.println("Silinen elemanlar: 1.eleman= "+ eleman1+ "   2.eleman= "+eleman2+"   3.eleman= "+ eleman3);             
      
       //Simdi ise LinkedList'e bakalim
        
       Queue<Integer>linkedex= new LinkedList<>();
                     
        linkedex.offer(87);
        linkedex.offer(878);
        linkedex.offer(5);
        linkedex.offer(7);
        linkedex.offer(1);
        linkedex.offer(100);
       
        System.out.println("Butun linkedex elemanlari: "+ linkedex);
               
    }
}
