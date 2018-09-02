package com.a.singletonPattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance() {
        if ( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomenthing() {
        System.out.println("Somenthing is Done.");
    }

}
