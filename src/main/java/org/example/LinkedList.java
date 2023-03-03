package org.example;
import java.util.logging.Logger;
class LinkedList {
    Logger log = Logger.getLogger("Contact");
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }


    void insertFirst(String name, String email, String number) {
        Node n = new Node(name, email, number);
        if (this.head == null)
            this.head = n;
        else {
            n.next = this.head;
            this.head = n;
        }
    }

    void insertLast(String name, String email, String number) {
        Node n = new Node(name, email, number);
        Node temp;
        if (this.head == null) {
            this.head = n;
        } else {
            temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            this.size++;
        }
    }

    void insertAt(String name, String email, String number, int index) {
        Node n = new Node(name, email, number);
        Node temp = this.head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    void removeFirst() {
        Node temp = this.head;
        this.head = temp.next;
    }

    void removeLast() {
        Node temp = this.head;
        Node prev = temp;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    void removeAt(int index) {
        Node temp = this.head;
        Node prev = temp;
        for (int i = 0; i < index; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    int search(String name) {
        int cnt = 1;
        Node temp = this.head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return cnt;
            }
            temp = temp.next;
            cnt++;
        }
        return -1;
    }

    void display() {
        Node temp = this.head;
        while (temp != null) {
            String s = "Name--" + temp.name + "\nEmail-- " + temp.email + "\nNumber--" + temp.number;
            log.info(s);
            temp = temp.next;
        }
    }
}
