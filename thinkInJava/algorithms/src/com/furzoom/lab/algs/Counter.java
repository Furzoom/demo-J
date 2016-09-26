package com.furzoom.lab.algs;

public class Counter
{
    private final String name;
    private int count;
    
    public Counter(String id)
    {
        this.name = id;
    }
    
    public void increment()
    {
        this.count++;
    }
    
    public int tally()
    {
        return this.count;
    }
    
    public String toString()
    {
        return this.count + " " + this.name;
    }
    
    public static void main(String[] args)
    {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        
        heads.increment();
        heads.increment();
        tails.increment();
        
        System.out.println(heads + " " + tails);
        System.out.println(heads.tally() + tails.tally());
        
    }
}
