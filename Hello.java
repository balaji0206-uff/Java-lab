package com.scsvmv.javalab.hello;

import java.util.Date;

/*
*Hello class
*Demonstrates method overloading and command-line arguments
*/
public class Hello {

  public Hello(){
  }

  public void wish(){
    system.out.println("Hello World");
  }

  public void wish (String name) {
    system.out.println("Hello"+name);
  }

  
  public void wishwithDate(String name) {
     Date today=new Date();
     system.out.println("Hello"+name+"|Date:"+today);
  }
}