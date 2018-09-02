package com.a.singletonPattern.synchronize;

import com.a.singletonPattern.singleton.Singleton;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingletonSync {

    private static SingletonSync instance;

    private LocalDateTime localDateTime;

    private SingletonSync() {
        System.out.println("Singleton is Instantiated.");
        System.out.println( LocalDateTime.now());
    }

    public static SingletonSync getInstance()  {
        try {
            synchronized ( SingletonSync.class ){
                System.out.println( Thread.currentThread().getName() );
                Thread.sleep(3000);
                if (instance == null) {
                    instance = new SingletonSync();

                }
            }

        }catch ( InterruptedException e ){
            e.printStackTrace();
        }
        return instance;
    }

    public void doSomenthing() {
        System.out.println("Somenthing is Done.");
    }

}
