package com.a.singletonPattern.synchronizedouble;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Main {

    public static void main( String [] args ) {

        CompletableFuture<SyncronizedChecked> t1 = CompletableFuture.supplyAsync( () -> SyncronizedChecked.getInstance() );
        CompletableFuture<SyncronizedChecked> t2 = CompletableFuture.supplyAsync( () -> SyncronizedChecked.getInstance() );
        CompletableFuture<SyncronizedChecked> t3 = CompletableFuture.supplyAsync( () -> SyncronizedChecked.getInstance() );
        CompletableFuture<SyncronizedChecked> t4 = CompletableFuture.supplyAsync( () -> SyncronizedChecked.getInstance() );
        CompletableFuture<SyncronizedChecked> t5 = CompletableFuture.supplyAsync( () -> SyncronizedChecked.getInstance() );
        CompletableFuture<SyncronizedChecked> t6 = CompletableFuture.supplyAsync( () -> SyncronizedChecked.getInstance() );

        Stream.of( t1, t2, t3, t4, t5, t6 )
                .map( CompletableFuture::join)
                .forEach( s -> s.doSomenthing() );
    }

}
