package com.weber.testingjar;

public class Main  implements Runnable{
    public String string(String command){
        return command;
    }




    public void run() {
        new Main().run();
        string("weber");
    }
}
