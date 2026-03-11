package com.practica01.demo.singlylist;

import com.practica01.demo.models.User;

public class UNode {
        public User data;
    public UNode next;

    public UNode(User data) {
        this.data = data;
        this.next = null;
    }
}
