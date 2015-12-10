package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPoolExecutorTest
implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests<java.util.concurrent.ThreadPoolExecutor> {

    @RunWith(J8Unit4.class)
    public static class AbortPolicyTest
    implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.AbortPolicyTests<java.util.concurrent.ThreadPoolExecutor.AbortPolicy> {

        @Override
        public java.util.concurrent.ThreadPoolExecutor.AbortPolicy createNewSUT() {
            return new java.util.concurrent.ThreadPoolExecutor.AbortPolicy();
        }

    }

    @RunWith(J8Unit4.class)
    public static class CallerRunsPolicyTest
    implements
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.CallerRunsPolicyTests<java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy> {

        @Override
        public java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy createNewSUT() {
            return new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy();
        }

    }

    @RunWith(J8Unit4.class)
    public static class DiscardOldestPolicyTest
    implements
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardOldestPolicyTests<java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy> {

        @Override
        public java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy createNewSUT() {
            return new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy();
        }

    }

    @RunWith(J8Unit4.class)
    public static class DiscardPolicyTest
    implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorTests.DiscardPolicyTests<java.util.concurrent.ThreadPoolExecutor.DiscardPolicy> {

        @Override
        public java.util.concurrent.ThreadPoolExecutor.DiscardPolicy createNewSUT() {
            return new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy();
        }

    }

    @Override
    public java.util.concurrent.ThreadPoolExecutor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.ThreadPoolExecutor] available.");
    }

}
