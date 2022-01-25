package com.example.demo.service;

import com.example.demo.model.Alien;
import com.example.demo.model.mongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {
    @Autowired
    mongodb db;

    public void addNewUser(Alien a)
    {
        db.save(a);
    }

    public List<Alien> findAllUsers()
    {
        return db.findAllAlien();
    }


    public Alien findUser(int aid)
    {
        Alien a=db.findAlien(aid);
        return  a;
    }

    public Alien deleteUser(int aid)
    {
        Alien a=db.delete(aid);
        return a;
    }

    public  String updateUser(Alien aid)
    {
        String s=db.update(aid);
        return s;

    }
}
