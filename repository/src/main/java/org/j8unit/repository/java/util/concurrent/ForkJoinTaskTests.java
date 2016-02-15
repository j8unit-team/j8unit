package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ForkJoinTask class java.util.concurrent.ForkJoinTask}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link ForkJoinTaskClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ForkJoinTask class java.util.concurrent.ForkJoinTask (the hereby targeted class-under-test
 *      class)
 * @see ForkJoinTaskClassTests ForkJoinTaskClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForkJoinTaskTests<SUT extends java.util.concurrent.ForkJoinTask<V>, V>
extends FutureTests<SUT, V>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#reinitialize() public void
     * java.util.concurrent.ForkJoinTask.reinitialize()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#reinitialize() public void
     * java.util.concurrent.ForkJoinTask.reinitialize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#reinitialize() public void
     *      java.util.concurrent.ForkJoinTask.reinitialize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reinitialize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isCancelled() public final boolean
     * java.util.concurrent.ForkJoinTask.isCancelled()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isCancelled() public final boolean
     * java.util.concurrent.ForkJoinTask.isCancelled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#isCancelled() public final boolean
     *      java.util.concurrent.ForkJoinTask.isCancelled() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isCancelled()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#getForkJoinTaskTag() public final short
     * java.util.concurrent.ForkJoinTask.getForkJoinTaskTag()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#getForkJoinTaskTag() public final short
     * java.util.concurrent.ForkJoinTask.getForkJoinTaskTag()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#getForkJoinTaskTag() public final short
     *      java.util.concurrent.ForkJoinTask.getForkJoinTaskTag() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getForkJoinTaskTag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#cancel(boolean) public boolean
     * java.util.concurrent.ForkJoinTask.cancel(boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#cancel(boolean) public boolean
     * java.util.concurrent.ForkJoinTask.cancel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#cancel(boolean) public boolean
     *      java.util.concurrent.ForkJoinTask.cancel(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_cancel_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#setForkJoinTaskTag(short) public final short
     * java.util.concurrent.ForkJoinTask.setForkJoinTaskTag(short)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#setForkJoinTaskTag(short) public final short
     * java.util.concurrent.ForkJoinTask.setForkJoinTaskTag(short)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#setForkJoinTaskTag(short) public final short
     *      java.util.concurrent.ForkJoinTask.setForkJoinTaskTag(short) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setForkJoinTaskTag_short()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#getException() public final java.lang.Throwable
     * java.util.concurrent.ForkJoinTask.getException()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#getException() public final java.lang.Throwable
     * java.util.concurrent.ForkJoinTask.getException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#getException() public final java.lang.Throwable
     *      java.util.concurrent.ForkJoinTask.getException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#quietlyComplete() public final void
     * java.util.concurrent.ForkJoinTask.quietlyComplete()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#quietlyComplete() public final void
     * java.util.concurrent.ForkJoinTask.quietlyComplete()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#quietlyComplete() public final void
     *      java.util.concurrent.ForkJoinTask.quietlyComplete() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_quietlyComplete()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#invoke() public final V
     * java.util.concurrent.ForkJoinTask.invoke()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#invoke() public final java.lang.Object
     * java.util.concurrent.ForkJoinTask.invoke()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#invoke() public final java.lang.Object
     *      java.util.concurrent.ForkJoinTask.invoke() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#quietlyInvoke() public final void
     * java.util.concurrent.ForkJoinTask.quietlyInvoke()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#quietlyInvoke() public final void
     * java.util.concurrent.ForkJoinTask.quietlyInvoke()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#quietlyInvoke() public final void
     *      java.util.concurrent.ForkJoinTask.quietlyInvoke() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_quietlyInvoke()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#completeExceptionally(Throwable) public void
     * java.util.concurrent.ForkJoinTask.completeExceptionally(java.lang.Throwable)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#completeExceptionally(Throwable) public void
     * java.util.concurrent.ForkJoinTask.completeExceptionally(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#completeExceptionally(Throwable) public void
     *      java.util.concurrent.ForkJoinTask.completeExceptionally(java.lang.Throwable) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_completeExceptionally_Throwable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isDone() public final boolean
     * java.util.concurrent.ForkJoinTask.isDone()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isDone() public final boolean
     * java.util.concurrent.ForkJoinTask.isDone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#isDone() public final boolean java.util.concurrent.ForkJoinTask.isDone()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#fork() public final java.util.concurrent.ForkJoinTask
     * <V> java.util.concurrent.ForkJoinTask.fork()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#fork() public final java.util.concurrent.ForkJoinTask
     * java.util.concurrent.ForkJoinTask.fork()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#fork() public final java.util.concurrent.ForkJoinTask
     *      java.util.concurrent.ForkJoinTask.fork() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fork()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#tryUnfork() public boolean
     * java.util.concurrent.ForkJoinTask.tryUnfork()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#tryUnfork() public boolean
     * java.util.concurrent.ForkJoinTask.tryUnfork()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#tryUnfork() public boolean java.util.concurrent.ForkJoinTask.tryUnfork()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tryUnfork()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#compareAndSetForkJoinTaskTag(short, short) public final
     * boolean java.util.concurrent.ForkJoinTask.compareAndSetForkJoinTaskTag(short,short)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#compareAndSetForkJoinTaskTag(short, short) public final
     * boolean java.util.concurrent.ForkJoinTask.compareAndSetForkJoinTaskTag(short,short)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#compareAndSetForkJoinTaskTag(short, short) public final boolean
     *      java.util.concurrent.ForkJoinTask.compareAndSetForkJoinTaskTag(short,short) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSetForkJoinTaskTag_short_short()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#get() public final V
     * java.util.concurrent.ForkJoinTask.get() throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#get() public final java.lang.Object
     * java.util.concurrent.ForkJoinTask.get() throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#get() public final java.lang.Object
     *      java.util.concurrent.ForkJoinTask.get() throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#get(long, java.util.concurrent.TimeUnit) public final V
     * java.util.concurrent.ForkJoinTask.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#get(long, java.util.concurrent.TimeUnit) public final
     * java.lang.Object java.util.concurrent.ForkJoinTask.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#get(long, java.util.concurrent.TimeUnit) public final java.lang.Object
     *      java.util.concurrent.ForkJoinTask.get(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isCompletedAbnormally() public final boolean
     * java.util.concurrent.ForkJoinTask.isCompletedAbnormally()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isCompletedAbnormally() public final boolean
     * java.util.concurrent.ForkJoinTask.isCompletedAbnormally()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#isCompletedAbnormally() public final boolean
     *      java.util.concurrent.ForkJoinTask.isCompletedAbnormally() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCompletedAbnormally()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#join() public final V
     * java.util.concurrent.ForkJoinTask.join()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#join() public final java.lang.Object
     * java.util.concurrent.ForkJoinTask.join()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#join() public final java.lang.Object
     *      java.util.concurrent.ForkJoinTask.join() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ForkJoinTask#getRawResult() public abstract V
     * java.util.concurrent.ForkJoinTask.getRawResult()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#getRawResult() public abstract java.lang.Object
     * java.util.concurrent.ForkJoinTask.getRawResult()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#getRawResult() public abstract java.lang.Object
     *      java.util.concurrent.ForkJoinTask.getRawResult() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRawResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isCompletedNormally() public final boolean
     * java.util.concurrent.ForkJoinTask.isCompletedNormally()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#isCompletedNormally() public final boolean
     * java.util.concurrent.ForkJoinTask.isCompletedNormally()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#isCompletedNormally() public final boolean
     *      java.util.concurrent.ForkJoinTask.isCompletedNormally() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCompletedNormally()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#complete(Object) public void
     * java.util.concurrent.ForkJoinTask.complete(V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#complete(Object) public void
     * java.util.concurrent.ForkJoinTask.complete(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#complete(Object) public void
     *      java.util.concurrent.ForkJoinTask.complete(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_complete_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#quietlyJoin() public final void
     * java.util.concurrent.ForkJoinTask.quietlyJoin()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ForkJoinTask#quietlyJoin() public final void
     * java.util.concurrent.ForkJoinTask.quietlyJoin()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ForkJoinTask#quietlyJoin() public final void
     *      java.util.concurrent.ForkJoinTask.quietlyJoin() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_quietlyJoin()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
