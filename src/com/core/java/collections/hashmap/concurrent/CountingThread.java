package com.core.java.collections.hashmap.concurrent;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class CountingThread extends Thread{

    private Map<Character, LongAdder> sharedBytesCounter;
    private byte[] data;
    private int lowerIndex;
    private int upperIndex;

    public CountingThread(Map<Character, LongAdder> sharedBytesCounter, byte[] data, int lowerIndex, int upperIndex) {
        super(lowerIndex+"~"+upperIndex);
        this.sharedBytesCounter = sharedBytesCounter;
        this.data = data;
        this.lowerIndex = lowerIndex;
        this.upperIndex = upperIndex;
    }

    @Override
    public void run(){
        long l1 = System.currentTimeMillis();
        for(int i=lowerIndex; i<= upperIndex; i++){
            byte b = data[i];
            Character c = (char) b;
            /*
            if(!sharedBytesCounter.containsKey(c)){
                LongAdder longAdder = new LongAdder();
                longAdder.increment();
                sharedBytesCounter.put(c,longAdder);
            } else {
                sharedBytesCounter.get(c).increment();
            }
             */
            sharedBytesCounter.computeIfAbsent(c, ch -> new LongAdder()).increment();
        }
        long l2 = System.currentTimeMillis();
        System.out.print("Time taken by thread : "+ Thread.currentThread().getName()+" "+ (l2-l1));
        System.out.println();
    }
}
