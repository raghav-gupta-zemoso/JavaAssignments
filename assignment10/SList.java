package com.assignments.assignment10;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data)
    {
        this.data=data;
    }

}
public class SList <T>{
    Node<T> head;
     int size = 0;
    void add(T data)
    {
        Node<T> temp = new Node<>(data);
        if (this.head == null) {
            head = temp;
            head.next=null;
        }
        else {
            Node<T> t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
            temp.next=null;
        }
        size++;
    }
    void remove(T key){
        Node<T> prev = new Node<>(null);
        prev.next = head;
        Node<T> next = head.next;
        Node<T> temp = head;
        boolean flag = false;

        if (head.data == key)
        {
            head = head.next;
            flag= true;
        }

        while (temp!= null)
        {

            if (String.valueOf(temp.data).equals(String.valueOf(key)))
            {
                prev.next = next;
                flag = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;

        }
        if (flag) {
            size--;
        }
        else {
            System.out.println("Given Value is not present in linked list");
        }

    }
    void show()
    {

        Node<T> temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }


}
