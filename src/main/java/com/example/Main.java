package com.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.*;

public class Main {
    static final Level epicFail = Level.forName("EPIC.FAIL!", 50);
    final static Logger log = LogManager.getLogger( Main.class);
    public static void main(String[] args) {
        log.debug( "==================MAIN.START==================");
        log.trace("0000000000000000000000000");
        log.trace("This is a trace message");
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        log.fatal("This is a fatal message");
        log.log(epicFail, "This is a epicFail message");
        System.out.println("\nHello Siddharth\n");
        log.debug( "main end");
    }
}