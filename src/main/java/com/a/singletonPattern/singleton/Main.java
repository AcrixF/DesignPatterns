package com.a.singletonPattern.singleton;

public class Main {

    public static void main( String [] args ) {
        Singleton.getInstance().doSomenthing();

        Singleton.getInstance().doSomenthing();
    }

}
