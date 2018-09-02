package com.a.singletonPattern.synchronizedouble;

import java.time.LocalDateTime;

public class SyncronizedChecked {

    public static SyncronizedChecked instance;

    private SyncronizedChecked(){
        System.out.println("Singleton is Instantiated.");
        System.out.println( LocalDateTime.now());
    }

    public static SyncronizedChecked getInstance() {
        try {
            if (instance == null) {
                synchronized (SyncronizedChecked.class) {
                    if (instance == null) {
                        Thread.sleep( 2000);
                        instance = new SyncronizedChecked();
                    }
                }
            }
        } catch ( InterruptedException e ){
            e.printStackTrace();
        }

        return instance;
    }

    public void doSomenthing() {
        System.out.println("Do somenthing else.");
    }

}
