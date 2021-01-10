package com.core.java.collections.hashmap.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentCounterOfBytes {

    private Map<Character, LongAdder> sharedBytesCounter = new ConcurrentHashMap<>();
    private byte[] data = new RandomByteArrayGenerator(65, 90, 1000000000).getRandomByteArray();

    public void count() throws InterruptedException {
        final int byteLength = 1000000000;
        final int threadsNeeded = 10;
        final int portion = byteLength / threadsNeeded;
        Thread[] threadArray = new Thread[threadsNeeded];
        for(int i=0; i< 10; i++){
            threadArray[i] = new CountingThread(sharedBytesCounter, data, portion*i, portion * (i+1)-1);
        }
        for(int i=0; i< 10; i++){
            threadArray[i].start();
        }
        Thread.sleep(30*1000);
        int bytesFormed = 0;
        for(Map.Entry<Character, LongAdder> bytesByCount :sharedBytesCounter.entrySet()){
            System.out.println(bytesByCount.getKey()+" : "+bytesByCount.getValue());
            bytesFormed+=bytesByCount.getValue().intValue();
        }
        System.out.println("        Total count of bytes : "+ bytesFormed);
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentCounterOfBytes concurrentCounterOfBytes = new ConcurrentCounterOfBytes();
        concurrentCounterOfBytes.count();
    }
}
