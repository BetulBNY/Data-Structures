/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;
import java.util.LinkedList;
import java.util.Queue;


public class ex_2 {
    public static void main(String[] args) {
     
    Queue myq= new LinkedList();
   
    // Adds elements {0, 1, 2, 3, 4} to the queue
    for(int i=0;i<10;i++)
    {
       // myq.offer(i);
        myq.add(i);
    } 
    // Display contents of the queue.   
     System.out.println("Queue'nin ilk hali: "+myq);   
     
     //To remove the head of queue.
     myq.remove();
     myq.poll();   //they both delete first element
     System.out.println("Ilk 2 elementin silinmis hali:"+myq);
        
     
     // To view the head of queue
     System.out.println("First element of the queue: "+myq.peek());  //yukarida ilk 2 elementi sildigimiz icin 3. elementi dondurdu.
     
     //view size of queue
        System.out.println("Size of the queue:"+ myq.size());
       
    }
}
