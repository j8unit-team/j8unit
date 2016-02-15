package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.FutureTask class java.util.concurrent.FutureTask}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link FutureTaskClassTests}.
 * </p>
 *
 * @see java.util.concurrent.FutureTask class java.util.concurrent.FutureTask (the hereby targeted class-under-test
 *      class)
 * @see FutureTaskClassTests FutureTaskClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FutureTaskTests<SUT extends java.util.concurrent.FutureTask<V>, V>
extends RunnableFutureTests<SUT, V>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#run() public void java.util.concurrent.FutureTask.run()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#run() public void java.util.concurrent.FutureTask.run()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.FutureTask#run() public void java.util.concurrent.FutureTask.run() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.FutureTask#isDone() public boolean
     * java.util.concurrent.FutureTask.isDone()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#isDone() public boolean
     * java.util.concurrent.FutureTask.isDone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.FutureTask#isDone() public boolean java.util.concurrent.FutureTask.isDone() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.FutureTask#cancel(boolean) public boolean
     * java.util.concurrent.FutureTask.cancel(boolean)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#cancel(boolean) public boolean
     * java.util.concurrent.FutureTask.cancel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.FutureTask#cancel(boolean) public boolean
     *      java.util.concurrent.FutureTask.cancel(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.FutureTask#isCancelled() public boolean
     * java.util.concurrent.FutureTask.isCancelled()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#isCancelled() public boolean
     * java.util.concurrent.FutureTask.isCancelled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.FutureTask#isCancelled() public boolean java.util.concurrent.FutureTask.isCancelled()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.FutureTask#get(long, java.util.concurrent.TimeUnit) public V
     * java.util.concurrent.FutureTask.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#get(long, java.util.concurrent.TimeUnit) public
     * java.lang.Object java.util.concurrent.FutureTask.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.FutureTask#get(long, java.util.concurrent.TimeUnit) public java.lang.Object
     *      java.util.concurrent.FutureTask.get(long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link java.util.concurrent.FutureTask#get() public V java.util.concurrent.FutureTask.get()
     * throws java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.FutureTask#get() public java.lang.Object
     * java.util.concurrent.FutureTask.get() throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.FutureTask#get() public java.lang.Object java.util.concurrent.FutureTask.get() throws
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

}
