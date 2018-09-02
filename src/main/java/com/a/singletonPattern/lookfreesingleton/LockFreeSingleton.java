package com.a.singletonPattern.lookfreesingleton;

import java.time.LocalDateTime;

public class LockFreeSingleton {

    private final static LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        try {
            System.out.println("LockFreeSingleton inistantiated. " );
            System.out.println(LocalDateTime.now());
        } catch (Exception e ) {

        }
    }

    public static  LockFreeSingleton getInstance() {
        return instance;
    }

    public void doSomenthing() {
        try {
            System.out.println("Somenthing is Done");
        } catch (Exception e ) {

        }
    }

}
