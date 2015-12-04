package org.j8unit.repository.javax.print.event;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.event.PrintJobListener interface javax.print.event.PrintJobListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.event.PrintJobListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintJobListenerTests<SUT extends javax.print.event.PrintJobListener>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.event.PrintJobListener#printDataTransferCompleted(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printDataTransferCompleted(javax.print.event.PrintJobEvent)}.
     * </p>
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
     * Test method for {@link javax.print.event.PrintJobListener#printJobCanceled(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobCanceled(javax.print.event.PrintJobEvent)}.
     * </p>
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
     * Test method for {@link javax.print.event.PrintJobListener#printJobCompleted(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobCompleted(javax.print.event.PrintJobEvent)}.
     * </p>
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
     * Test method for {@link javax.print.event.PrintJobListener#printJobFailed(javax.print.event.PrintJobEvent) public
     * abstract void javax.print.event.PrintJobListener.printJobFailed(javax.print.event.PrintJobEvent)}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobListener#printJobNoMoreEvents(javax.print.event.PrintJobEvent)
     * public abstract void javax.print.event.PrintJobListener.printJobNoMoreEvents(javax.print.event.PrintJobEvent)}.
     * </p>
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
     * </p>
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

}
