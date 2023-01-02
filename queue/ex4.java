/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;
class Queue{
    private static int head, rear, capacity;
    private static int queue[];
    
    Queue(int size){    //constructer
        head=rear=0;
        capacity=size;
        queue= new int[capacity];
    }
    
    static void queueEnqueue(int item){  //this method for insert element into the queue. Take argument "item"
                                         //it adds integer to the rear of the queue
        //it will chech if queue is full
        if(capacity == rear){
            System.out.println("Queue is full");
            return;
        }
        //add element at the rear
        else{
            queue[rear]= item;
            rear++;
        }
    }
}

//NOW we'll check if queue is full

public class ex4 {
    public static void main(String[] args) {
        Queue q = new Queue(5);   //we create queue with capacity of 5
        q.queueEnqueue(1);
        q.queueEnqueue(2);
        q.queueEnqueue(3);
        q.queueEnqueue(4);
        q.queueEnqueue(5);
        q.queueEnqueue(6); // queue is full, error message is printed
             
    }
            
}
