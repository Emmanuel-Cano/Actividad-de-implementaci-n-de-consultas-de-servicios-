package com.practica01.demo.service;

import org.springframework.stereotype.Service;

import com.practica01.demo.models.User;
import com.practica01.demo.singlylist.SingleLinkedList;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {
    
    private final SingleLinkedList users = new SingleLinkedList();
    private static final int MAX_WAITLIST = 50;

@PostConstruct
public void init() {

    User u1 = new User(1, "Juan", "Perez", "20243ds100", "BD, App web, App movil");
    User u2 = new User(2, "Gabriel", "Soriano", "20243ds102", "BD, Calculo integral");
    User u3 = new User(3, "Esteban", "Castillo", "20243ds101", "Etica, Redes");
    User u4 = new User(4, "Kevin", "Porcayo", "20243ds104", "App movil, Calculo diferencial");
    User u5 = new User(5, "Carlos", "Villaba", "20243ds105", "BD, App web");

    users.add(u1);
    users.add(u2);
    users.add(u3);
    users.add(u4);
    users.add(u5);
}

        public User findById(int id) {
        return users.findById(id);
    }

    public User[] getAll() {
        return users.toArray();
    }



}
