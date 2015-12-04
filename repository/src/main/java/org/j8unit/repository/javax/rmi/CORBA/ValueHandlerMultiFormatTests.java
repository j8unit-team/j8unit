package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.rmi.CORBA.ValueHandlerMultiFormat interface javax.rmi.CORBA.ValueHandlerMultiFormat},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.rmi.CORBA.ValueHandlerMultiFormatClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ValueHandlerMultiFormatTests<SUT extends javax.rmi.CORBA.ValueHandlerMultiFormat>
extends org.j8unit.repository.javax.rmi.CORBA.ValueHandlerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.ValueHandlerMultiFormat#getMaximumStreamFormatVersion() public abstract
     * byte javax.rmi.CORBA.ValueHandlerMultiFormat.getMaximumStreamFormatVersion()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaximumStreamFormatVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.rmi.CORBA.ValueHandlerMultiFormat#writeValue(org.omg.CORBA.portable.OutputStream,java.io.Serializable,byte)
     * public abstract void
     * javax.rmi.CORBA.ValueHandlerMultiFormat.writeValue(org.omg.CORBA.portable.OutputStream,java.io.Serializable,byte)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeValue_OutputStream_Serializable_byte()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
