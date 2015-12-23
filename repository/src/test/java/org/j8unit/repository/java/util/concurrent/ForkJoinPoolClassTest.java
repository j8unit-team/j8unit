package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForkJoinPoolClassTest
implements org.j8unit.repository.java.util.concurrent.ForkJoinPoolClassTests<java.util.concurrent.ForkJoinPool> {

    @Override
    public Class<java.util.concurrent.ForkJoinPool> createNewSUT() {
        return java.util.concurrent.ForkJoinPool.class;
    }

    @RunWith(J8Unit4.class)
    public static class ForkJoinWorkerThreadFactoryClassTest
    implements
    org.j8unit.repository.java.util.concurrent.ForkJoinPoolClassTests.ForkJoinWorkerThreadFactoryClassTests<java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory> {

        @Override
        public Class<java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory> createNewSUT() {
            return java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ManagedBlockerClassTest
    implements org.j8unit.repository.java.util.concurrent.ForkJoinPoolClassTests.ManagedBlockerClassTests<java.util.concurrent.ForkJoinPool.ManagedBlocker> {

        @Override
        public Class<java.util.concurrent.ForkJoinPool.ManagedBlocker> createNewSUT() {
            return java.util.concurrent.ForkJoinPool.ManagedBlocker.class;
        }

    }

}
