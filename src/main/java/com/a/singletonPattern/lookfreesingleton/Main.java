package com.a.singletonPattern.lookfreesingleton;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Main {

    public static void main( String [] args ) {

        CompletableFuture<LockFreeSingleton> t1 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );
        CompletableFuture<LockFreeSingleton> t2 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );
        CompletableFuture<LockFreeSingleton> t3 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );
        CompletableFuture<LockFreeSingleton> t4 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );
        CompletableFuture<LockFreeSingleton> t5 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );
        CompletableFuture<LockFreeSingleton> t6 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );
        CompletableFuture<LockFreeSingleton> t7 = CompletableFuture.supplyAsync( () -> LockFreeSingleton.getInstance() );

        Stream.of( t1, t2, t3, t4, t5, t6, t7)
                .map( CompletableFuture::join )
                .forEach( s -> s.doSomenthing()  );

    }

}
