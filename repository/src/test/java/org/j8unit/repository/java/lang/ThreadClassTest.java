package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadClassTest
implements org.j8unit.repository.java.lang.ThreadClassTests<java.lang.Thread> {

    @Override
    public Class<java.lang.Thread> createNewSUT() {
        return java.lang.Thread.class;
    }

    @RunWith(J8Unit4.class)
    public static class UncaughtExceptionHandlerClassTest
    implements org.j8unit.repository.java.lang.ThreadClassTests.UncaughtExceptionHandlerClassTests<java.lang.Thread.UncaughtExceptionHandler> {

        @Override
        public Class<java.lang.Thread.UncaughtExceptionHandler> createNewSUT() {
            return java.lang.Thread.UncaughtExceptionHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class StateClassTest
    implements org.j8unit.repository.java.lang.ThreadClassTests.StateClassTests<java.lang.Thread.State> {

        @Override
        public Class<java.lang.Thread.State> createNewSUT() {
            return java.lang.Thread.State.class;
        }

    }

}
