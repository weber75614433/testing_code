package com.weber;

import java.util.Arrays;

public class App {

    /*static String string = "prod -x abc -y def -z ghi";
    static String[] strings = string.split("\\s+(?=-)");
    static String[] copy = new String[strings.length - 1];*/

    static void testing(){
        String string = "1 2 3 4 5 6";
        String[] source = string.split("\\s+");
        String[] copy = new String[source.length-1];

        System.arraycopy(source, 1, copy, 0, source.length-1);

        for(int i = 0; i < copy.length; i++){
            System.out.println(copy[i]);
        }

    }

    public static void main(String[] args){
        testing();

    }

}
