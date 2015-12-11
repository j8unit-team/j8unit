package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletableFutureTest<T>
implements org.j8unit.repository.java.util.concurrent.CompletableFutureTests<java.util.concurrent.CompletableFuture<T>, T> {

    @Override
    public java.util.concurrent.CompletableFuture<T> createNewSUT() {
        return new java.util.concurrent.CompletableFuture<>();
    }

}
