package org.j8unit.repository.javax.print.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.event.PrintServiceAttributeEvent class
 * javax.print.event.PrintServiceAttributeEvent}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.print.event.PrintServiceAttributeEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.event.PrintServiceAttributeEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.event.PrintServiceAttributeEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintServiceAttributeEventTests<SUT extends javax.print.event.PrintServiceAttributeEvent>
extends org.j8unit.repository.javax.print.event.PrintEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintServiceAttributeEvent#getAttributes() public
     * javax.print.attribute.PrintServiceAttributeSet javax.print.event.PrintServiceAttributeEvent.getAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.event.PrintServiceAttributeEvent#getAttributes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintServiceAttributeEvent#getPrintService() public
     * javax.print.PrintService javax.print.event.PrintServiceAttributeEvent.getPrintService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.event.PrintServiceAttributeEvent#getPrintService()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
