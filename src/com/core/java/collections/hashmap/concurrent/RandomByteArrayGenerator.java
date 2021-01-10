package com.core.java.collections.hashmap.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class RandomByteArrayGenerator {

    private int lowerBound;
    private int upperBound;
    private int requiredByteArraySize;

    public RandomByteArrayGenerator(int lowerBound, int upperBound, int requiredByteArraySize) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.requiredByteArraySize = requiredByteArraySize;
    }

    public byte[] getRandomByteArray(){
        byte[] data = new byte[requiredByteArraySize];
        for(int i=0; i<requiredByteArraySize;i++){
            data[i] = getRandomByte();
        }
        return data;
    }

    private byte getRandomByte(){
       return (byte) ((Math.random() * (upperBound+1 - lowerBound)) + lowerBound);
    }

    public static void printStats(byte[] data) {
        long l1 = System.currentTimeMillis();
        Map<Character, Integer> countOfBytes = new HashMap<>();
        for(int i=0; i< data.length; i++){
            byte b = data[i];
            Character c = (char) b;
            if(!countOfBytes.containsKey(c)){
                countOfBytes.put(c,1);
            } else {
                countOfBytes.put(c, countOfBytes.get(c)+1);
            }
        }
        long l2 = System.currentTimeMillis();
        int bytesFormed = 0;
        for(Map.Entry<Character, Integer> bytesByCount :countOfBytes.entrySet()){
            System.out.println(bytesByCount.getKey()+" : "+bytesByCount.getValue());
            bytesFormed+=bytesByCount.getValue();
        }
        System.out.println("Over all time taken to count : "+ (l2-l1)+ " millis");
        System.out.println("        Total count of bytes : "+ bytesFormed);
    }

    public static void main(String a[]){
        RandomByteArrayGenerator randomByteArrayGenerator = new RandomByteArrayGenerator(65, 90, 1000000000);
        byte[] data = randomByteArrayGenerator.getRandomByteArray();
        printStats(data);
    }
}
