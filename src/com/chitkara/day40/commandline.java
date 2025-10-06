package com.chitkara.day40;


public class commandline {
    public static void main(String [] args){

        System.out.println("Number of arguments: "+args.length);
        for(String arg:args){
            System.out.println(arg);
        }
    }
}