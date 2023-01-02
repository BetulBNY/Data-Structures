/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;
import java.util.LinkedList;
import java.util.Queue;

public class ex1 {
    
    
    public static void main(String[] args) {
    //Create queue        
    Queue <String> queue= new LinkedList<>();
    
    //add elements to queue
    
    queue.offer("b");
    queue.offer("k");
    queue.offer("m");
    queue.offer("n");
  
    //print queue
    System.out.println("Queue:"+ queue);
    queue.remove(); //when we don't enter anything it start remove from first
    System.out.println("Queue:"+ queue); 
    queue.remove("k");  //remove only "k"
    System.out.println("Queue:"+ queue); 
    }

}
