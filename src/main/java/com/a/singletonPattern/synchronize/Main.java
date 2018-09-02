package com.a.singletonPattern.synchronize;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Main {

    public static void main( String [] args ) throws Exception{

        CompletableFuture<SingletonSync> t1 = CompletableFuture.supplyAsync( () -> SingletonSync.getInstance());
        CompletableFuture<SingletonSync> t2 = CompletableFuture.supplyAsync( () -> SingletonSync.getInstance());
        CompletableFuture<SingletonSync> t3 = CompletableFuture.supplyAsync( () -> SingletonSync.getInstance());

        Stream.of( t1, t2, t3)
                .map( CompletableFuture::join )
                .forEach( s -> s.doSomenthing());
    }

}
