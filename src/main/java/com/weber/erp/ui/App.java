package com.weber.erp.ui;

public class App implements Runnable{
    private static Terminal terminal;
    public static Terminal getTerminal(){
        return terminal;
    }

    private static MainPage mainPage;
    public static MainPage getMainPage(){
        return mainPage;
    }

    public static void main(String[] args){
        /*new App().run();
        //terminal.setFrameVisible();
        mainPage.setFrameVisible();*/
    }

    public void run() {
        terminal = new Terminal();
        mainPage = new MainPage();
    }
}
