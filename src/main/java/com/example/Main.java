package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.*;


public class Main {
    final static Logger log = LogManager.getLogger( Main.class);
    public static void main(String[] args) {
        log.debug( "main start");
        log.info("VERY TRALALA");
        System.out.println("\nHello Siddharth\n");
        log.debug( "main end");
    }
}