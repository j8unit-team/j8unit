package org.j8unit.repository.java.lang;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Thread class java.lang.Thread}. The complementary j8unit test interface
 * containing the class relevant aspects is {@link ThreadClassTests}.
 * </p>
 *
 * @see Thread class java.lang.Thread (the hereby targeted class-under-test class)
 * @see ThreadClassTests ThreadClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadTests<SUT extends Thread>
extends RunnableTests<SUT>, ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link Thread#isDaemon() public final boolean java.lang.Thread.isDaemon()}.
     *
     * <p>
     * Test method for {@link Thread#isDaemon() public final boolean java.lang.Thread.isDaemon()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#isDaemon() public final boolean java.lang.Thread.isDaemon() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDaemon()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getStackTrace() public java.lang.StackTraceElement[]
     * java.lang.Thread.getStackTrace()}.
     *
     * <p>
     * Test method for {@link Thread#getStackTrace() public java.lang.StackTraceElement[]
     * java.lang.Thread.getStackTrace()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getStackTrace() public java.lang.StackTraceElement[] java.lang.Thread.getStackTrace() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStackTrace()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#join(long) public final synchronized void java.lang.Thread.join(long) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link Thread#join(long) public final synchronized void java.lang.Thread.join(long) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#join(long) public final synchronized void java.lang.Thread.join(long) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_join_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#join(long, int) public final synchronized void java.lang.Thread.join(long,int)
     * throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link Thread#join(long, int) public final synchronized void java.lang.Thread.join(long,int)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#join(long, int) public final synchronized void java.lang.Thread.join(long,int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_join_long_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#join() public final void java.lang.Thread.join() throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link Thread#join() public final void java.lang.Thread.join() throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#join() public final void java.lang.Thread.join() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_join()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#interrupt() public void java.lang.Thread.interrupt()}.
     *
     * <p>
     * Test method for {@link Thread#interrupt() public void java.lang.Thread.interrupt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#interrupt() public void java.lang.Thread.interrupt() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_interrupt()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getName() public final java.lang.String java.lang.Thread.getName()}.
     *
     * <p>
     * Test method for {@link Thread#getName() public final java.lang.String java.lang.Thread.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getName() public final java.lang.String java.lang.Thread.getName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getThreadGroup() public final java.lang.ThreadGroup
     * java.lang.Thread.getThreadGroup()}.
     *
     * <p>
     * Test method for {@link Thread#getThreadGroup() public final java.lang.ThreadGroup
     * java.lang.Thread.getThreadGroup()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getThreadGroup() public final java.lang.ThreadGroup java.lang.Thread.getThreadGroup() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getThreadGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#setName(String) public final synchronized void
     * java.lang.Thread.setName(java.lang.String)}.
     *
     * <p>
     * Test method for {@link Thread#setName(String) public final synchronized void
     * java.lang.Thread.setName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#setName(String) public final synchronized void java.lang.Thread.setName(java.lang.String) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#setContextClassLoader(ClassLoader) public void
     * java.lang.Thread.setContextClassLoader(java.lang.ClassLoader)}.
     *
     * <p>
     * Test method for {@link Thread#setContextClassLoader(ClassLoader) public void
     * java.lang.Thread.setContextClassLoader(java.lang.ClassLoader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#setContextClassLoader(ClassLoader) public void
     *      java.lang.Thread.setContextClassLoader(java.lang.ClassLoader) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContextClassLoader_ClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#run() public void java.lang.Thread.run()}.
     *
     * <p>
     * Test method for {@link Thread#run() public void java.lang.Thread.run()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#run() public void java.lang.Thread.run() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_run()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getId() public long java.lang.Thread.getId()}.
     *
     * <p>
     * Test method for {@link Thread#getId() public long java.lang.Thread.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getId() public long java.lang.Thread.getId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getContextClassLoader() public java.lang.ClassLoader
     * java.lang.Thread.getContextClassLoader()}.
     *
     * <p>
     * Test method for {@link Thread#getContextClassLoader() public java.lang.ClassLoader
     * java.lang.Thread.getContextClassLoader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getContextClassLoader() public java.lang.ClassLoader java.lang.Thread.getContextClassLoader() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContextClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#stop(Throwable) public final synchronized void
     * java.lang.Thread.stop(java.lang.Throwable)}.
     *
     * <p>
     * Test method for {@link Thread#stop(Throwable) public final synchronized void
     * java.lang.Thread.stop(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#stop(Throwable) public final synchronized void java.lang.Thread.stop(java.lang.Throwable) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stop_Throwable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#stop() public final void java.lang.Thread.stop()}.
     *
     * <p>
     * Test method for {@link Thread#stop() public final void java.lang.Thread.stop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#stop() public final void java.lang.Thread.stop() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stop()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getState() public java.lang.Thread$State java.lang.Thread.getState()}.
     *
     * <p>
     * Test method for {@link Thread#getState() public java.lang.Thread$State java.lang.Thread.getState()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getState() public java.lang.Thread$State java.lang.Thread.getState() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#setDaemon(boolean) public final void java.lang.Thread.setDaemon(boolean)}.
     *
     * <p>
     * Test method for {@link Thread#setDaemon(boolean) public final void java.lang.Thread.setDaemon(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#setDaemon(boolean) public final void java.lang.Thread.setDaemon(boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDaemon_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#isAlive() public final native boolean java.lang.Thread.isAlive()}.
     *
     * <p>
     * Test method for {@link Thread#isAlive() public final native boolean java.lang.Thread.isAlive()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#isAlive() public final native boolean java.lang.Thread.isAlive() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAlive()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#setPriority(int) public final void java.lang.Thread.setPriority(int)}.
     *
     * <p>
     * Test method for {@link Thread#setPriority(int) public final void java.lang.Thread.setPriority(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#setPriority(int) public final void java.lang.Thread.setPriority(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPriority_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#toString() public java.lang.String java.lang.Thread.toString()}.
     *
     * <p>
     * Test method for {@link Thread#toString() public java.lang.String java.lang.Thread.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#toString() public java.lang.String java.lang.Thread.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#countStackFrames() public native int java.lang.Thread.countStackFrames()}.
     *
     * <p>
     * Test method for {@link Thread#countStackFrames() public native int java.lang.Thread.countStackFrames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#countStackFrames() public native int java.lang.Thread.countStackFrames() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_countStackFrames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getPriority() public final int java.lang.Thread.getPriority()}.
     *
     * <p>
     * Test method for {@link Thread#getPriority() public final int java.lang.Thread.getPriority()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getPriority() public final int java.lang.Thread.getPriority() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPriority()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#isInterrupted() public boolean java.lang.Thread.isInterrupted()}.
     *
     * <p>
     * Test method for {@link Thread#isInterrupted() public boolean java.lang.Thread.isInterrupted()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#isInterrupted() public boolean java.lang.Thread.isInterrupted() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInterrupted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler) public void
     * java.lang.Thread.setUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)}.
     *
     * <p>
     * Test method for {@link Thread#setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler) public void
     * java.lang.Thread.setUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler) public void
     *      java.lang.Thread.setUncaughtExceptionHandler(java.lang.Thread$UncaughtExceptionHandler) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUncaughtExceptionHandler_UncaughtExceptionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#resume() public final void java.lang.Thread.resume()}.
     *
     * <p>
     * Test method for {@link Thread#resume() public final void java.lang.Thread.resume()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#resume() public final void java.lang.Thread.resume() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resume()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#suspend() public final void java.lang.Thread.suspend()}.
     *
     * <p>
     * Test method for {@link Thread#suspend() public final void java.lang.Thread.suspend()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#suspend() public final void java.lang.Thread.suspend() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_suspend()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#checkAccess() public final void java.lang.Thread.checkAccess()}.
     *
     * <p>
     * Test method for {@link Thread#checkAccess() public final void java.lang.Thread.checkAccess()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#checkAccess() public final void java.lang.Thread.checkAccess() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkAccess()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#getUncaughtExceptionHandler() public java.lang.Thread$UncaughtExceptionHandler
     * java.lang.Thread.getUncaughtExceptionHandler()}.
     *
     * <p>
     * Test method for {@link Thread#getUncaughtExceptionHandler() public java.lang.Thread$UncaughtExceptionHandler
     * java.lang.Thread.getUncaughtExceptionHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#getUncaughtExceptionHandler() public java.lang.Thread$UncaughtExceptionHandler
     *      java.lang.Thread.getUncaughtExceptionHandler() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUncaughtExceptionHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#destroy() public void java.lang.Thread.destroy()}.
     *
     * <p>
     * Test method for {@link Thread#destroy() public void java.lang.Thread.destroy()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#destroy() public void java.lang.Thread.destroy() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Thread#start() public synchronized void java.lang.Thread.start()}.
     *
     * <p>
     * Test method for {@link Thread#start() public synchronized void java.lang.Thread.start()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Thread#start() public synchronized void java.lang.Thread.start() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain Thread.UncaughtExceptionHandler interface
     * java.lang.Thread$UncaughtExceptionHandler}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link ThreadClassTests.UncaughtExceptionHandlerClassTests}.
     * </p>
     *
     * @see Thread.UncaughtExceptionHandler interface java.lang.Thread$UncaughtExceptionHandler (the hereby targeted
     *      class-under-test class)
     * @see ThreadClassTests.UncaughtExceptionHandlerClassTests ThreadClassTests.UncaughtExceptionHandlerClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UncaughtExceptionHandlerTests<SUT extends Thread.UncaughtExceptionHandler>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable) public abstract
         * void java.lang.Thread$UncaughtExceptionHandler.uncaughtException(java.lang.Thread,java.lang.Throwable)}.
         *
         * <p>
         * Test method for {@link Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable) public abstract
         * void java.lang.Thread$UncaughtExceptionHandler.uncaughtException(java.lang.Thread,java.lang.Throwable)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see Thread.UncaughtExceptionHandler#uncaughtException(Thread, Throwable) public abstract void
         *      java.lang.Thread$UncaughtExceptionHandler.uncaughtException(java.lang.Thread,java.lang.Throwable) (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_uncaughtException_Thread_Throwable()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain Thread.State class java.lang.Thread$State}. The complementary j8unit
     * test interface containing the class relevant aspects is {@link ThreadClassTests.StateClassTests}.
     * </p>
     *
     * @see Thread.State class java.lang.Thread$State (the hereby targeted class-under-test class)
     * @see ThreadClassTests.StateClassTests ThreadClassTests.StateClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StateTests<SUT extends Thread.State>
    extends EnumTests<SUT, Thread.State> {

    }

}
