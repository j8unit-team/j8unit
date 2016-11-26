package org.j8unit.repository.java.lang;

import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Thread} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.ThreadClassTests}).
 */
@RunWith(J8Unit4.class)
public class ThreadClassTest
implements ThreadClassTests<Thread> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Thread]

    @Override
    public Class<Thread> createNewSUT() {
        return Thread.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread(Runnable) public
     * java.lang.Thread(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_Runnable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(Runnable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread() public java.lang.Thread()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = new Thread();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread(ThreadGroup, Runnable, String)
     * public java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_ThreadGroup_Runnable_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(ThreadGroup, Runnable, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread(Runnable, String) public
     * java.lang.Thread(java.lang.Runnable,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_Runnable_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(Runnable, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread(ThreadGroup, String) public
     * java.lang.Thread(java.lang.ThreadGroup,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_ThreadGroup_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(ThreadGroup, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread(String) public
     * java.lang.Thread(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Thread#Thread(ThreadGroup, Runnable) public
     * java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_ThreadGroup_Runnable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(ThreadGroup, Runnable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link Thread#Thread(ThreadGroup, Runnable, String, long) public
     * java.lang.Thread(java.lang.ThreadGroup,java.lang.Runnable,java.lang.String,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Thread_ThreadGroup_Runnable_String_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Thread sut = null; // = new Thread(ThreadGroup, Runnable, String, long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#yield() public static native void
     * java.lang.Thread.yield()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_yield()
    throws Exception {
        // write some test for {@link Thread#yield()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Thread#setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler) public static void
     * java.lang.Thread.setDefaultUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setDefaultUncaughtExceptionHandler_UncaughtExceptionHandler()
    throws Exception {
        // write some test for {@link Thread#setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#dumpStack() public static void
     * java.lang.Thread.dumpStack()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_dumpStack()
    throws Exception {
        // write some test for {@link Thread#dumpStack()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#getAllStackTraces() public static
     * java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> java.lang.Thread.getAllStackTraces()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAllStackTraces()
    throws Exception {
        // write some test for {@link Thread#getAllStackTraces()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#currentThread() public static native
     * java.lang.Thread java.lang.Thread.currentThread()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_currentThread()
    throws Exception {
        // write some test for {@link Thread#currentThread()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#holdsLock(Object) public static native
     * boolean java.lang.Thread.holdsLock(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_holdsLock_Object()
    throws Exception {
        // write some test for {@link Thread#holdsLock(Object)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#getDefaultUncaughtExceptionHandler() public
     * static java.lang.Thread$UncaughtExceptionHandler java.lang.Thread.getDefaultUncaughtExceptionHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getDefaultUncaughtExceptionHandler()
    throws Exception {
        // write some test for {@link Thread#getDefaultUncaughtExceptionHandler()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#sleep(long, int) public static void
     * java.lang.Thread.sleep(long,int) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_sleep_long_int()
    throws Exception {
        // write some test for {@link Thread#sleep(long, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#sleep(long) public static native void
     * java.lang.Thread.sleep(long) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_sleep_long()
    throws Exception {
        // write some test for {@link Thread#sleep(long)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#activeCount() public static int
     * java.lang.Thread.activeCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_activeCount()
    throws Exception {
        // write some test for {@link Thread#activeCount()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#interrupted() public static boolean
     * java.lang.Thread.interrupted()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_interrupted()
    throws Exception {
        // write some test for {@link Thread#interrupted()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Thread#enumerate(Thread[]) public static int
     * java.lang.Thread.enumerate(java.lang.Thread[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_enumerate_ThreadArray()
    throws Exception {
        // write some test for {@link Thread#enumerate(Thread[])}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Thread]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Thread]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link UncaughtExceptionHandler} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.lang.ThreadClassTests.UncaughtExceptionHandlerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class UncaughtExceptionHandlerClassTest
    implements UncaughtExceptionHandlerClassTests<UncaughtExceptionHandler> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Thread$UncaughtExceptionHandler]

        @Override
        public Class<UncaughtExceptionHandler> createNewSUT() {
            return UncaughtExceptionHandler.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Thread$UncaughtExceptionHandler]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Thread$UncaughtExceptionHandler]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link State} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.lang.ThreadClassTests.StateClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class StateClassTest
    implements StateClassTests<State> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Thread$State]

        @Override
        public Class<State> createNewSUT() {
            return State.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link Thread.State#values() public static
         * java.lang.Thread$State[] java.lang.Thread$State.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link Thread.State#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link Thread.State#valueOf(String) public static
         * java.lang.Thread$State java.lang.Thread$State.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link Thread.State#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Thread$State]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Thread$State]

    }

}
