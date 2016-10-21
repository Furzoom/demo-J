/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 21, 2016 9:00:31 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */
package com.furzoom.lab.algs.ch102;

import com.furzoom.lab.algs.SmartDate;

class Transaction implements Comparable<Transaction>
{
    private final String name;
    private final SmartDate date;
    private final double amount;
    
    public Transaction(String who, SmartDate when, double amount)
    {
        this.name = who;
        this.date = when;
        this.amount = amount;
    }
    
    public Transaction(String transaction)
    {
        String[] s = transaction.split("\\s+");
        if (s.length != 3)
            throw new IllegalArgumentException("Argument illegal " + transaction);
        this.name = s[0];
        this.date = new SmartDate(s[1]);
        this.amount = Double.parseDouble(s[2]);
    }
    
    public String who()
    {
        return this.name;
    }
    
    public SmartDate when()
    {
        return this.date;
    }
    
    public double amount()
    {
        return this.amount;
    }
    
    public String toString()
    {
        return name + " " + date + " " + amount;
    }
    
    public boolean equals(Object that)
    {
        if (this == that) return true;
        if (that == null) return false;
        if (this.getClass() != that.getClass()) return false;
        Transaction t = (Transaction) that;
        if (!this.name.equals(t.name)) return false; 
        if (!this.date.equals(t.date)) return false;
        if (this.amount != t.amount) return false; 
        return true;
    }
    
    public int hashCode()
    {
        int hash = 1;
        hash = hash * 31 + this.name.hashCode();
        hash = hash * 31 + this.date.hashCode();
        hash = hash * 31 + ((Double) this.amount).hashCode();
        return hash;
    }


    @Override
    public int compareTo(Transaction o)
    {
        if (this.amount > o.amount) return 1;
        else if (this.amount < o.amount) return -1;
        else return 0;
    }
}