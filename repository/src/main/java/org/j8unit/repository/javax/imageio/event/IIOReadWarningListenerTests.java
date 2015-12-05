package org.j8unit.repository.javax.imageio.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.event.IIOReadWarningListener interface
 * javax.imageio.event.IIOReadWarningListener}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.event.IIOReadWarningListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIOReadWarningListenerTests<SUT extends javax.imageio.event.IIOReadWarningListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.event.IIOReadWarningListener#warningOccurred(javax.imageio.ImageReader,java.lang.String)
     * public abstract void
     * javax.imageio.event.IIOReadWarningListener.warningOccurred(javax.imageio.ImageReader,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_warningOccurred_ImageReader_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}