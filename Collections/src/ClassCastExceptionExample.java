package com.devdaily.javasamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassCastExceptionExample {

    public ClassCastExceptionExample() {

        List<String> list = new ArrayList<>();
        list.add("one");
    
        // ... some time later
    
        Iterator it = list.iterator();
        while (it.hasNext()) {
            // intentionally throw a ClassCastException by trying to cast a String to an
            // Integer (technically this is casting an Object to an Integer, where the Object 
            // is really a reference to a String:
            Integer i = (Integer)it.next();
      }

  }

  public static void main(String[] args) {
      new ClassCastExceptionExample();
  }

}