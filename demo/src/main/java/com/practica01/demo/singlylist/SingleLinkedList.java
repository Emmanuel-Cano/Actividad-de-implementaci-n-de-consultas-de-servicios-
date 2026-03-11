package com.practica01.demo.singlylist;

import com.practica01.demo.models.User;

public class SingleLinkedList {

    private UNode head;

    public SingleLinkedList() {
        this.head = null;
    }

    public void add(User user) {
        UNode newNode = new UNode(user);

        if (head == null) {
            head = newNode;
            return;
        }

        UNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public User findById(int id) {
        UNode current = head;

        while (current != null) {
            if (current.data.getId() == id) {
                return current.data;
            }
            current = current.next;
        }

        return null;
    }

    public User[] toArray() {
        int count = 0;

        UNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        User[] result = new User[count];
        current = head;

        int i = 0;
        while (current != null) {
            result[i++] = current.data;
            current = current.next;
        }

        return result;
    }


    public boolean remove(int id) {
        if (head == null) {
            return false;
        }
        if (head.data.getId() == id) {
            head = head.next;
            return true;
        }

        UNode current = head;
        while (current.next != null) {
            if (current.next.data.getId() == id) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }
}