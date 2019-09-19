package com.interthreadcom.sample;

public class EvenThread extends Thread{
    Store s = null;
    EvenThread(Store s){
          this.s = s;
    }
    
    public void run() {
          String threadName = "EVEN THREAD";
          setName(threadName);
          Store.printFor(threadName, threadName+" Running......");
          synchronized(s) {
                while(!s.isOver(threadName)) {
                      if(s.oddThreadConsumed(threadName)) { // is Odd already consumed.
                    	  Store.printFor(threadName, threadName+" consumed "+s.getItem(threadName)+" Notified");
                          s.notify();
                      }else {
                            try {
                            	 Store.printFor(threadName, threadName+" Waiting......");
                            	 s.wait();
                            	 Store.printFor(threadName, threadName+" resumed......");
                            } catch (InterruptedException e) {
                            	 Store.printFor(threadName, "Exception in "+ threadName);
                                  //e.printStackTrace();
                            }
                      }
                }
          }
          System.out.println(threadName+" Completed....");
    }
}
