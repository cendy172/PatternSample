package com.liqing.receiver;

public class CeilingFan
{

    String location = "";

    int level = 0;

    public static final int LOW = 0;
    public static final int MEDIUM = 1;
    public static final int HIGH = 2;

    public CeilingFan(String location) {
        super();
        this.location = location;
    }

    public void high(){
        this.level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium(){
        this.level = MEDIUM;
        System.out.println(this.location + "ceiling fan is on medium");
    }

    public void low(){
        this.level = LOW;
        System.out.println(this.location + "ceiling fan is on low");
    }

    public void off(){
        this.level = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed(){
        return this.level;
    }
}
