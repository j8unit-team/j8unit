package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadPoolExecutorClassTest
implements org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests<java.util.concurrent.ThreadPoolExecutor> {

    @Override
    public Class<java.util.concurrent.ThreadPoolExecutor> createNewSUT() {
        return java.util.concurrent.ThreadPoolExecutor.class;
    }

    @RunWith(J8Unit4.class)
    public static class DiscardPolicyClassTest
    implements
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardPolicyClassTests<java.util.concurrent.ThreadPoolExecutor.DiscardPolicy> {

        @Override
        public Class<java.util.concurrent.ThreadPoolExecutor.DiscardPolicy> createNewSUT() {
            return java.util.concurrent.ThreadPoolExecutor.DiscardPolicy.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class AbortPolicyClassTest
    implements
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.AbortPolicyClassTests<java.util.concurrent.ThreadPoolExecutor.AbortPolicy> {

        @Override
        public Class<java.util.concurrent.ThreadPoolExecutor.AbortPolicy> createNewSUT() {
            return java.util.concurrent.ThreadPoolExecutor.AbortPolicy.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class CallerRunsPolicyClassTest
    implements
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.CallerRunsPolicyClassTests<java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy> {

        @Override
        public Class<java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy> createNewSUT() {
            return java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DiscardOldestPolicyClassTest
    implements
    org.j8unit.repository.java.util.concurrent.ThreadPoolExecutorClassTests.DiscardOldestPolicyClassTests<java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy> {

        @Override
        public Class<java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy> createNewSUT() {
            return java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy.class;
        }

    }

}
