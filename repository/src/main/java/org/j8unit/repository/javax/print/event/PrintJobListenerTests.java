package org.j8unit.repository.javax.print.event;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.event.PrintJobListener interface
 * javax.print.event.PrintJobListener}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link PrintJobListenerClassTests}.
 * </p>
 *
 * @see javax.print.event.PrintJobListener interface javax.print.event.PrintJobListener (the hereby targeted
 *      class-under-test class)
 * @see PrintJobListenerClassTests PrintJobListenerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintJobListenerTests<SUT extends javax.print.event.PrintJobListener>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.event.PrintJobListener#printDataTransferCompleted(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printDataTransferCompleted(javax.print.event.PrintJobEvent)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.event.PrintJobListener#printDataTransferCompleted(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printDataTransferCompleted(javax.print.event.PrintJobEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.event.PrintJobListener#printDataTransferCompleted(javax.print.event.PrintJobEvent) public
     *      abstract void javax.print.event.PrintJobListener.printDataTransferCompleted(javax.print.event.PrintJobEvent)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printDataTransferCompleted_PrintJobEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobNoMoreEvents(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobNoMoreEvents(javax.print.event.PrintJobEvent)}.
     *
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobNoMoreEvents(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobNoMoreEvents(javax.print.event.PrintJobEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.event.PrintJobListener#printJobNoMoreEvents(javax.print.event.PrintJobEvent) public abstract
     *      void javax.print.event.PrintJobListener.printJobNoMoreEvents(javax.print.event.PrintJobEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printJobNoMoreEvents_PrintJobEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.event.PrintJobListener#printJobRequiresAttention(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printJobRequiresAttention(javax.print.event.PrintJobEvent)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.event.PrintJobListener#printJobRequiresAttention(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printJobRequiresAttention(javax.print.event.PrintJobEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.event.PrintJobListener#printJobRequiresAttention(javax.print.event.PrintJobEvent) public
     *      abstract void javax.print.event.PrintJobListener.printJobRequiresAttention(javax.print.event.PrintJobEvent)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printJobRequiresAttention_PrintJobEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobCompleted(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobCompleted(javax.print.event.PrintJobEvent)}.
     *
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobCompleted(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobCompleted(javax.print.event.PrintJobEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.event.PrintJobListener#printJobCompleted(javax.print.event.PrintJobEvent) public abstract void
     *      javax.print.event.PrintJobListener.printJobCompleted(javax.print.event.PrintJobEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printJobCompleted_PrintJobEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobCanceled(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobCanceled(javax.print.event.PrintJobEvent)}.
     *
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobCanceled(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobCanceled(javax.print.event.PrintJobEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.event.PrintJobListener#printJobCanceled(javax.print.event.PrintJobEvent) public abstract void
     *      javax.print.event.PrintJobListener.printJobCanceled(javax.print.event.PrintJobEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printJobCanceled_PrintJobEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobFailed(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printJobFailed(javax.print.event.PrintJobEvent)}.
     *
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobFailed(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printJobFailed(javax.print.event.PrintJobEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.event.PrintJobListener#printJobFailed(javax.print.event.PrintJobEvent) public abstract void
     *      javax.print.event.PrintJobListener.printJobFailed(javax.print.event.PrintJobEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printJobFailed_PrintJobEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
