package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CompletableFutureClassTest
implements org.j8unit.repository.java.util.concurrent.CompletableFutureClassTests<java.util.concurrent.CompletableFuture> {

    @RunWith(J8Unit4.class)
    public static class AsynchronousCompletionTaskClassTest
    implements
    org.j8unit.repository.java.util.concurrent.CompletableFutureClassTests.AsynchronousCompletionTaskClassTests<java.util.concurrent.CompletableFuture.AsynchronousCompletionTask> {

        @Override
        public Class<java.util.concurrent.CompletableFuture.AsynchronousCompletionTask> createNewSUT() {
            return java.util.concurrent.CompletableFuture.AsynchronousCompletionTask.class;
        }

    }

    @Override
    public Class<java.util.concurrent.CompletableFuture> createNewSUT() {
        return java.util.concurrent.CompletableFuture.class;
    }

}
