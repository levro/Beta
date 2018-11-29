package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

    private final static Logger log = LogManager.getLogger( Utils.class);

    static String sumOfTwoStrings (String str1, String str2) {

        long a;
        long b;
        log.info( "Parsing strings to long" );
        try {
            a = Long.parseLong( str1 );
            b = Long.parseLong( str2 );
            log.info( "Success" );
        } catch ( NumberFormatException e ) {
            log.error( "This is not number" );
            return "0";
        }
        return String.valueOf( a + b );
    }
}
