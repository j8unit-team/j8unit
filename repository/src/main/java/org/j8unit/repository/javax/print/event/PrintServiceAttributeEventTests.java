package org.j8unit.repository.javax.print.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.event.PrintServiceAttributeEvent class javax.print.event.PrintServiceAttributeEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.event.PrintServiceAttributeEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrintServiceAttributeEventTests<SUT extends javax.print.event.PrintServiceAttributeEvent>
extends org.j8unit.repository.javax.print.event.PrintEventTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintServiceAttributeEvent#getAttributes() public javax.print.attribute.PrintServiceAttributeSet javax.print.event.PrintServiceAttributeEvent.getAttributes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintServiceAttributeEvent#getPrintService() public javax.print.PrintService javax.print.event.PrintServiceAttributeEvent.getPrintService()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintService() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
