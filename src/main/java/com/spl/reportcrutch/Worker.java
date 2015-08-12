/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spl.reportcrutch;

/**
 *
 * @author Vlad
 */
public class Worker {
    private long id;
    private Post post;
    private String FIO;
    private String address;
    private int money;
    
    
    public Worker (){}
    
    public Worker (long id, Post post, String FIO, String address, int money) {        
        this.id = id;
        this.post = post;
        this.FIO = FIO;
        this.address = address;
        this.money = money;
    }
    
    //getters-setters
    public long getid() {
        return id;
    }
    
    public void setid(long id) {
        this.id = id;
    }
    
    public Post getPost(){
        return this.post;
    }
    
    public void setPost(Post post){
        this.post = post;
    }
    
    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
    
}
