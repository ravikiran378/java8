package com.interthreadcom.sample;

public class OddThread extends Thread{
    Store s = null;
    OddThread(Store s){
          this.s = s;
    }
    
    public void run() {
    	
          String threadName = "ODD  THREAD";
          setName(threadName);
         Store.printFor(threadName, threadName+" Running......");
         synchronized(s) {
                while(!s.isOver(threadName)) {
                      if(!s.oddThreadConsumed(threadName)) { // is Odd Thread yet to consume.
                            	 Store.printFor(threadName, threadName+" consumed "+s.getItem(threadName)+" Notified");
                                  s.notify();
                      }else {
                            try {
                            	 Store.printFor(threadName, threadName+" Waiting......");
                                 s.wait();
                                 Store.printFor(threadName, threadName+" resumed ");
                            } catch (InterruptedException e) {
                                  System.out.println("Exception in "+ threadName);
                                  //e.printStackTrace();
                            }
                      }
                }
         }
                Store.printFor(threadName, threadName+" Completed....");
    }
}
