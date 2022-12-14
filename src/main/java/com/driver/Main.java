package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly=new RWOnly();
        //java: name has private access in com.driver.RWOnly
        rwonly.setName("Hafeez");
        System.out.println(rwonly.getName());
    }
  
}