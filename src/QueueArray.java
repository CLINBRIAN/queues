/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamau
 */
public class QueueArray {
    
//here we are using circular queue bcos of empty space in the array which makes it to be very expensive
    
    int maxSize;
    int front;
    int rear;
    int currentSize;
    int arr[];

    public QueueArray(int size) {
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
        this.arr = new int[size];
    }

    public void enQueue(int data) {
        if (maxSize  == currentSize) {
            throw new RuntimeException("the array is full");
        }
        if (rear == maxSize-1) {
           rear = -1;
        }
        arr[++rear] = data;
        System.out.println(data + " is added in the queue");
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("the array is empty");
        }
        int result = arr[front++];
        if (front == maxSize) {  //this is to initialize the front to point to zero if array is full bcos we using circular array
            front = 0;
        }
        currentSize--;
        return result;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

}
