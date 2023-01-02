/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;
import java.util.*;
import java.util.Queue;

public class iterating_ex5 {
    public static void main(String[] args) {
    Queue <String> name= new PriorityQueue<>();
        name.add("kben");
        name.add("ben");
        name.add("aben");
        name.add("cben");
        
     Iterator exiterator= name.iterator();
     while(exiterator.hasNext())
     {
         System.out.println(exiterator.next());
     }
      
    }
}
