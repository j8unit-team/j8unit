package org.j8unit.repository.javax.print.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.event.PrintJobEvent class javax.print.event.PrintJobEvent}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.print.event.PrintJobEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.event.PrintJobEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.event.PrintJobEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintJobEventTests<SUT extends javax.print.event.PrintJobEvent>
extends org.j8unit.repository.javax.print.event.PrintEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobEvent#getPrintEventType() public int
     * javax.print.event.PrintJobEvent.getPrintEventType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.event.PrintJobEvent#getPrintEventType()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintEventType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintJobEvent#getPrintJob() public javax.print.DocPrintJob
     * javax.print.event.PrintJobEvent.getPrintJob()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.event.PrintJobEvent#getPrintJob()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintJob()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
