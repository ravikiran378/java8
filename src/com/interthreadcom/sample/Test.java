package com.interthreadcom.sample;

public class Test {

    public static void main(String[] args) {
          Store s = new Store();
          OddThread o = new OddThread(s);
          EvenThread e = new EvenThread(s);
          o.start();
          e.start();
    }

}
