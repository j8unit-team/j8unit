package org.j8unit.repository.javax.imageio.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.event.IIOWriteWarningListener interface
 * javax.imageio.event.IIOWriteWarningListener}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.event.IIOWriteWarningListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IIOWriteWarningListenerTests<SUT extends javax.imageio.event.IIOWriteWarningListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.event.IIOWriteWarningListener#warningOccurred(javax.imageio.ImageWriter,int,java.lang.String)
     * public abstract void
     * javax.imageio.event.IIOWriteWarningListener.warningOccurred(javax.imageio.ImageWriter,int,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_warningOccurred_ImageWriter_int_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
