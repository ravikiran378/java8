package com.interthreadcom.sample;

public class Store {

	private int[] data = {1,2,3,4,5,6,7,8,9,10};
    private int runningIndex=-1;
    
    int getItem(String threadName) {
          //System.out.println(threadName+" requesting data                        @ "+ new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
          return data[++runningIndex];
    }
    
    public boolean isOver(String threadName) {
          //System.out.println(threadName+" checking if all numbers are  completed @ "+ new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    	 //Store.printFor(threadName, this+" "+ threadName+" LOC A");  
    	return data.length==1+runningIndex;
    }
    
    public boolean  oddThreadConsumed(String threadName) {
          //System.out.println(threadName+" checking if oddThreadConsumed          @ "+ new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    	 //Store.printFor(threadName, this+" "+ threadName+" LOC B");  
    	return runningIndex%2==0;
    }
    
    
    
    @Override
	public String toString() {
		return "runningIndex=" + runningIndex;
	}

    public static final void printFor(String treadName,String message) {
    	if(treadName.equals("EVEN THREAD")) {
    		System.out.println("                                              "+ message);
    	}else {
    		System.out.println(message);
    	}
    }
    
	public static void main(String... a) {
          Store s = new Store();
          while(!s.isOver("TEST THREAD")) {
                System.out.println(
                		s.oddThreadConsumed("TEST THREAD")+" "+
                s.getItem("TEST THREAD")+" "+
                s.oddThreadConsumed("TEST THREAD"));
          }
    }
}
