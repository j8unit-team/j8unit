package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.SwingWorker class javax.swing.SwingWorker}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SwingWorkerClassTests}.
 * </p>
 *
 * @see javax.swing.SwingWorker class javax.swing.SwingWorker (the hereby targeted class-under-test class)
 * @see SwingWorkerClassTests SwingWorkerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SwingWorkerTests<SUT extends javax.swing.SwingWorker<T, V>, T, V>
extends org.j8unit.repository.java.util.concurrent.RunnableFutureTests<SUT, T>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#getPropertyChangeSupport() public final
     * java.beans.PropertyChangeSupport javax.swing.SwingWorker.getPropertyChangeSupport()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#getPropertyChangeSupport() public final
     * java.beans.PropertyChangeSupport javax.swing.SwingWorker.getPropertyChangeSupport()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#getPropertyChangeSupport() public final java.beans.PropertyChangeSupport
     *      javax.swing.SwingWorker.getPropertyChangeSupport() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyChangeSupport()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public final void javax.swing.SwingWorker.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public final void javax.swing.SwingWorker.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#addPropertyChangeListener(java.beans.PropertyChangeListener) public final void
     *      javax.swing.SwingWorker.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#getState() public final javax.swing.SwingWorker$StateValue
     * javax.swing.SwingWorker.getState()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#getState() public final javax.swing.SwingWorker$StateValue
     * javax.swing.SwingWorker.getState()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#getState() public final javax.swing.SwingWorker$StateValue
     *      javax.swing.SwingWorker.getState() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.SwingWorker#get(long, java.util.concurrent.TimeUnit) public final T
     * javax.swing.SwingWorker.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#get(long, java.util.concurrent.TimeUnit) public final
     * java.lang.Object javax.swing.SwingWorker.get(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#get(long, java.util.concurrent.TimeUnit) public final java.lang.Object
     *      javax.swing.SwingWorker.get(long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link javax.swing.SwingWorker#get() public final T javax.swing.SwingWorker.get() throws
     * java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#get() public final java.lang.Object javax.swing.SwingWorker.get()
     * throws java.lang.InterruptedException,java.util.concurrent.ExecutionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#get() public final java.lang.Object javax.swing.SwingWorker.get() throws
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
     * Test method for {@link javax.swing.SwingWorker#run() public final void javax.swing.SwingWorker.run()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#run() public final void javax.swing.SwingWorker.run()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#run() public final void javax.swing.SwingWorker.run() (the hereby targeted
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
     * Test method for {@link javax.swing.SwingWorker#execute() public final void javax.swing.SwingWorker.execute()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#execute() public final void javax.swing.SwingWorker.execute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#execute() public final void javax.swing.SwingWorker.execute() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_execute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#isDone() public final boolean javax.swing.SwingWorker.isDone()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#isDone() public final boolean javax.swing.SwingWorker.isDone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#isDone() public final boolean javax.swing.SwingWorker.isDone() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.swing.SwingWorker#getProgress() public final int
     * javax.swing.SwingWorker.getProgress()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#getProgress() public final int
     * javax.swing.SwingWorker.getProgress()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#getProgress() public final int javax.swing.SwingWorker.getProgress() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProgress()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public final void javax.swing.SwingWorker.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public final void javax.swing.SwingWorker.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#removePropertyChangeListener(java.beans.PropertyChangeListener) public final void
     *      javax.swing.SwingWorker.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#cancel(boolean) public final boolean
     * javax.swing.SwingWorker.cancel(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#cancel(boolean) public final boolean
     * javax.swing.SwingWorker.cancel(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#cancel(boolean) public final boolean javax.swing.SwingWorker.cancel(boolean) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.SwingWorker#firePropertyChange(String, Object, Object) public final void
     * javax.swing.SwingWorker.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#firePropertyChange(String, Object, Object) public final void
     * javax.swing.SwingWorker.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#firePropertyChange(String, Object, Object) public final void
     *      javax.swing.SwingWorker.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange_String_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.SwingWorker#isCancelled() public final boolean
     * javax.swing.SwingWorker.isCancelled()}.
     *
     * <p>
     * Test method for {@link javax.swing.SwingWorker#isCancelled() public final boolean
     * javax.swing.SwingWorker.isCancelled()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.SwingWorker#isCancelled() public final boolean javax.swing.SwingWorker.isCancelled() (the hereby
     *      targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.SwingWorker.StateValue class
     * javax.swing.SwingWorker$StateValue}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link SwingWorkerClassTests.StateValueClassTests}.
     * </p>
     *
     * @see javax.swing.SwingWorker.StateValue class javax.swing.SwingWorker$StateValue (the hereby targeted
     *      class-under-test class)
     * @see SwingWorkerClassTests.StateValueClassTests SwingWorkerClassTests.StateValueClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StateValueTests<SUT extends javax.swing.SwingWorker.StateValue>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.SwingWorker.StateValue> {

    }

}
