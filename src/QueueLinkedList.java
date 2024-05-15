/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamau
 */
public class QueueLinkedList {
    //here we are using singular linked List
    private Node rear;
    private Node front;
    private int size;   //total number of elements in the queue

    public QueueLinkedList() {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
            size++;
        } else {
            rear.setNext(newNode);
            rear = newNode;
            size++;
        }
    }

    public int deQueue() {
        int response = 0;
        if (front != null) {
            if (front.getNext() != null) {
                response = front.getData();
                front = front.getNext();
                size--;
            } else {
                response = front.getData();
                front = null;
                rear = null;

                size--;
            }
        }

        return response;
    }

    public int peek() {
        int response = 0;
        if (front == null) {
            System.out.println("the list is empty");
        } else {
            response = front.getData();
        }
        return response;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
