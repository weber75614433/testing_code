package com.weber;

import java.util.HashMap;
import java.util.Map;

public class Testing implements Runnable{
    Map<String, TestRule> test = new HashMap<String, TestRule>();
    private String command;

    public String getCommand(){
        return command = "hello";
    }

    public void setTest(){
        test.put("hello", new TestRule(new TestCommand()));
    }



    public static void main(String[] args){
        new Testing().run();
    }

    public void run() {
        getCommand();
        setTest();

        for(String command : test.keySet()){
            if(this.command.equalsIgnoreCase(command)){
                System.out.println("yes");
                Runnable runnable = test.get(command).runnable;
                new Thread(runnable).start();
            }
        }

    }
}
