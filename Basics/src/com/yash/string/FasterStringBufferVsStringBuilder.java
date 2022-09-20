package com.yash.string;

public class FasterStringBufferVsStringBuilder {
	long startTime = 0l;
    long endTime = 0l;
    long timeDiff = 0l;
    // Concatenates to String 
    public void concat1(String website) 
    { 
        startTime = System.nanoTime();
        website = website + ".com";
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Time taken by String: " + timeDiff);
    } 
 
    // Concatenates to StringBuilder 
    public void concat2(StringBuilder website) 
    {  
        startTime = System.nanoTime();
        website.append(".com"); 
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + timeDiff);
    } 
 
    // Concatenates to StringBuffer 
    public void concat3(StringBuffer website) 
    { 
        startTime = System.nanoTime();
        website.append(".com");
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + timeDiff);
    } 
 
    public static void main(String[] args) 
    { 
    	FasterStringBufferVsStringBuilder object = new FasterStringBufferVsStringBuilder();
        String s1 = "w3spoint"; 
        object.concat1(s1);
 
        StringBuilder s2 = new StringBuilder("w3spoint"); 
        object.concat2(s2);
 
        StringBuffer s3 = new StringBuffer("w3spoint"); 
        object.concat3(s3); 
    } 

}
