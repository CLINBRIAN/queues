/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamau
 */
public class Main {

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        QueueLinkedList linkedList = new QueueLinkedList();
        //queue.enQueue(5);
       // queue.enQueue(7);
        //queue.enQueue(2);
        //queue.enQueue(1);
        //queue.enQueue(8);
       //queue.enQueue(4);

       //System.out.println(" value removed is "+queue.dequeue());
        // System.out.println(" size is "+queue.size());
        linkedList.enQueue(2);
        linkedList.enQueue(3);
        linkedList.enQueue(5);
        linkedList.enQueue(9);
        linkedList.enQueue(4);
        
        System.out.println("the removed value is "+linkedList.deQueue());
        System.out.println("the total size is "+linkedList.size());
        System.out.println("the front value is "+linkedList.peek());
         linkedList.deQueue();
        
    }
}
