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
 * Test class for {@link javax.print.event.PrintEvent class javax.print.event.PrintEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.event.PrintEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrintEventTests<SUT extends javax.print.event.PrintEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.event.PrintEvent#toString() public java.lang.String javax.print.event.PrintEvent.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
